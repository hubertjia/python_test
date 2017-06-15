from xml.parsers.expat import  ParserCreate

class DefaultSaxHandler(object):
    def start_element(self, name, attrs):
        print 'start name: %s, attars %s' %(name, attrs)

    def end_element(self, name):
        print 'end %s ' % name


    def char_data(self, text):
        print 'char_data is %s ' %text

xml = r'''<?xml version="1.0"?>
    <ol>
        <li><a href="/python">Python</a></li>
        <li><a href="/ruby">Ruby</a></li>
    </ol>
    '''

handler = DefaultSaxHandler()
parser = ParserCreate()

parser.returns_unicode = True

parser.StartElementHandler = handler.start_element
parser.EndElementHandler = handler.end_element
parser.CharacterDataHandler = handler.char_data
parser.Parse(xml)