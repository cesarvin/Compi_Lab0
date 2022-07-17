import sys
import os
from antlr4 import *
from ANTLR.YAPLLexer import YAPLLexer
from ANTLR.YAPLParser import YAPLParser
#from ANTLR.YAPLListener import YAPLListener
from antlr4.error.ErrorListener import ErrorListener
import shutil

class MyErrorListener( ErrorListener ):

  def __init__(self):
    super(MyErrorListener, self).__init__()

  def syntaxError(self, recognizer, offendingSymbol, line, column, msg, e):
    sys.tracebacklimit = -0
    raise Exception("syntaxError!!", msg)
  

def draw_ANTLRTree():
  os.chdir('ANTLRJava')
  bashCommand = "java org.antlr.v4.gui.TestRig YAPL program tree.cl -gui"
  os.system(bashCommand)  


def main(argv):
    input = FileStream(argv[1])
    lexer = YAPLLexer(input)
    stream = CommonTokenStream(lexer)
    parser = YAPLParser(stream)
    parser.addErrorListener( MyErrorListener() )
    tree = parser.program()

    if (tree):
      shutil.copyfile(argv[1], 'ANTLRJava\\tree.cl') #copy file to draw folder
      draw_ANTLRTree()

if __name__ == '__main__':
    main(sys.argv)