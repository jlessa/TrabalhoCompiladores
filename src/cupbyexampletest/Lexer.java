/* The following code was generated by JFlex 1.6.1 */

package cupbyexampletest;

import java_cup.runtime.ComplexSymbolFactory;
import java_cup.runtime.ComplexSymbolFactory.Location;
import java_cup.runtime.Symbol;

// Imports adicionados
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Files;
import cupbyexampletest.sym;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.6.1
 * from the specification file <tt>./src/cupbyexampletest/lexer.lex</tt>
 */
public class Lexer implements java_cup.runtime.Scanner, sym {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0, 0
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\0\1\3\1\2\1\7\1\10\1\1\22\0\1\3\1\60\3\0"+
    "\1\64\1\57\1\0\1\52\1\53\1\11\1\63\1\50\1\13\1\14"+
    "\1\6\1\12\11\5\1\0\1\47\1\61\1\51\1\62\2\0\4\4"+
    "\1\16\15\4\1\42\7\4\1\45\1\0\1\46\1\0\1\4\1\0"+
    "\1\21\1\25\1\17\1\32\1\15\1\37\1\44\1\36\1\26\2\4"+
    "\1\20\1\41\1\31\1\34\1\23\1\4\1\40\1\22\1\30\1\24"+
    "\1\33\1\35\1\27\1\43\1\4\1\54\1\56\1\55\7\0\1\7"+
    "\u1fa2\0\1\7\1\7\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\udfe6\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\2\2\1\3\1\4\1\5\1\6\1\4"+
    "\1\7\1\10\17\3\1\11\1\12\1\13\1\14\1\15"+
    "\1\16\1\17\1\20\1\21\2\1\1\22\1\23\1\24"+
    "\1\25\1\26\1\0\1\2\1\0\10\3\1\27\12\3"+
    "\1\30\1\31\1\32\1\33\1\34\1\35\1\36\1\0"+
    "\7\3\1\37\2\3\1\40\7\3\1\0\1\41\6\3"+
    "\1\42\1\43\1\44\3\3\1\45\2\3\2\36\1\0"+
    "\1\3\1\46\4\3\1\47\1\50\4\3\1\51\1\52"+
    "\1\53\1\3\1\54\2\3\1\55\1\56\2\0\1\57"+
    "\12\0\1\60";

  private static int [] zzUnpackAction() {
    int [] result = new int[145];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\65\0\152\0\65\0\237\0\324\0\u0109\0\65"+
    "\0\u013e\0\u0173\0\65\0\u01a8\0\u01dd\0\u0212\0\u0247\0\u027c"+
    "\0\u02b1\0\u02e6\0\u031b\0\u0350\0\u0385\0\u03ba\0\u03ef\0\u0424"+
    "\0\u0459\0\u048e\0\65\0\65\0\65\0\65\0\u04c3\0\65"+
    "\0\65\0\65\0\65\0\u04f8\0\u052d\0\u0562\0\u0597\0\u05cc"+
    "\0\65\0\65\0\u0601\0\u0636\0\u066b\0\u06a0\0\u06d5\0\u070a"+
    "\0\u073f\0\u0774\0\u07a9\0\u07de\0\u0813\0\237\0\u0848\0\u087d"+
    "\0\u08b2\0\u08e7\0\u091c\0\u0951\0\u0986\0\u09bb\0\u09f0\0\u0a25"+
    "\0\65\0\65\0\65\0\65\0\65\0\65\0\u0a5a\0\u0a8f"+
    "\0\u0ac4\0\u0af9\0\u0b2e\0\u0b63\0\u0b98\0\u0bcd\0\u0c02\0\237"+
    "\0\u0c37\0\u0c6c\0\237\0\u0ca1\0\u0cd6\0\u0d0b\0\u0d40\0\u0d75"+
    "\0\u0daa\0\u0ddf\0\u0e14\0\237\0\u0e49\0\u0e7e\0\u0eb3\0\u0ee8"+
    "\0\u0f1d\0\u0f52\0\237\0\237\0\237\0\u0f87\0\u0fbc\0\u0ff1"+
    "\0\237\0\u1026\0\u105b\0\u1090\0\65\0\u10c5\0\u10fa\0\237"+
    "\0\u112f\0\u1164\0\u1199\0\u11ce\0\237\0\237\0\u1203\0\u1238"+
    "\0\u126d\0\u12a2\0\237\0\237\0\237\0\u12d7\0\237\0\u130c"+
    "\0\u1341\0\237\0\237\0\u1376\0\u13ab\0\65\0\u13e0\0\u1415"+
    "\0\u144a\0\u147f\0\u14b4\0\u14e9\0\u151e\0\u1553\0\u1588\0\u15bd"+
    "\0\65";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[145];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\2\1\3\2\4\1\5\1\6\1\7\1\0\1\4"+
    "\1\10\1\11\1\12\1\13\1\14\1\5\1\15\1\16"+
    "\1\5\1\17\1\20\1\5\1\21\1\22\1\5\1\23"+
    "\1\24\1\5\1\25\1\5\1\26\1\5\1\27\1\30"+
    "\1\31\1\32\2\5\1\33\1\34\1\35\1\36\1\37"+
    "\1\40\1\41\1\42\1\43\1\44\1\45\1\46\1\47"+
    "\1\50\1\51\1\52\67\0\1\4\66\0\2\5\4\0"+
    "\1\5\2\0\30\5\25\0\1\6\4\0\1\6\1\0"+
    "\1\53\56\0\1\54\2\0\1\55\67\0\1\53\55\0"+
    "\1\6\63\0\2\5\4\0\1\5\2\0\3\5\1\56"+
    "\6\5\1\57\15\5\24\0\2\5\4\0\1\5\2\0"+
    "\3\5\1\60\24\5\24\0\2\5\4\0\1\5\2\0"+
    "\1\61\27\5\24\0\2\5\4\0\1\5\2\0\13\5"+
    "\1\62\14\5\24\0\2\5\4\0\1\5\2\0\7\5"+
    "\1\63\20\5\24\0\2\5\4\0\1\5\2\0\17\5"+
    "\1\64\10\5\24\0\2\5\4\0\1\5\2\0\14\5"+
    "\1\65\5\5\1\66\5\5\24\0\2\5\4\0\1\5"+
    "\2\0\21\5\1\67\1\5\1\70\4\5\24\0\2\5"+
    "\4\0\1\5\2\0\1\71\27\5\24\0\2\5\4\0"+
    "\1\5\2\0\17\5\1\72\10\5\24\0\2\5\4\0"+
    "\1\5\2\0\21\5\1\73\6\5\24\0\2\5\4\0"+
    "\1\5\2\0\4\5\1\74\23\5\24\0\2\5\4\0"+
    "\1\5\2\0\1\75\27\5\24\0\2\5\4\0\1\5"+
    "\2\0\4\5\1\76\23\5\24\0\2\5\4\0\1\5"+
    "\2\0\13\5\1\77\12\5\1\100\1\5\71\0\1\101"+
    "\71\0\1\102\65\0\1\103\56\0\1\104\64\0\1\105"+
    "\64\0\1\106\20\0\1\107\4\0\1\107\52\0\1\54"+
    "\2\0\4\54\2\0\54\54\11\55\1\110\53\55\4\0"+
    "\2\5\4\0\1\5\2\0\5\5\1\111\22\5\24\0"+
    "\2\5\4\0\1\5\2\0\13\5\1\112\14\5\24\0"+
    "\2\5\4\0\1\5\2\0\4\5\1\113\23\5\24\0"+
    "\2\5\4\0\1\5\2\0\14\5\1\114\13\5\24\0"+
    "\2\5\4\0\1\5\2\0\4\5\1\115\23\5\24\0"+
    "\2\5\4\0\1\5\2\0\10\5\1\116\17\5\24\0"+
    "\2\5\4\0\1\5\2\0\17\5\1\117\10\5\24\0"+
    "\2\5\4\0\1\5\2\0\13\5\1\120\14\5\24\0"+
    "\2\5\4\0\1\5\2\0\11\5\1\121\16\5\24\0"+
    "\2\5\4\0\1\5\2\0\7\5\1\122\20\5\24\0"+
    "\2\5\4\0\1\5\2\0\20\5\1\123\7\5\24\0"+
    "\2\5\4\0\1\5\2\0\11\5\1\124\16\5\24\0"+
    "\2\5\4\0\1\5\2\0\11\5\1\125\16\5\24\0"+
    "\2\5\4\0\1\5\2\0\3\5\1\126\24\5\24\0"+
    "\2\5\4\0\1\5\2\0\13\5\1\127\14\5\24\0"+
    "\2\5\4\0\1\5\2\0\11\5\1\130\16\5\24\0"+
    "\2\5\4\0\1\5\2\0\23\5\1\131\4\5\24\0"+
    "\2\5\4\0\1\5\2\0\5\5\1\132\22\5\25\0"+
    "\1\107\4\0\1\107\2\0\2\133\46\0\6\55\1\4"+
    "\2\55\1\110\53\55\4\0\2\5\4\0\1\5\2\0"+
    "\1\134\27\5\24\0\2\5\4\0\1\5\2\0\1\135"+
    "\27\5\24\0\2\5\4\0\1\5\2\0\5\5\1\136"+
    "\22\5\24\0\2\5\4\0\1\5\2\0\27\5\1\137"+
    "\24\0\2\5\4\0\1\5\2\0\13\5\1\140\14\5"+
    "\24\0\2\5\4\0\1\5\2\0\3\5\1\141\24\5"+
    "\24\0\2\5\4\0\1\5\2\0\3\5\1\142\24\5"+
    "\24\0\2\5\4\0\1\5\2\0\5\5\1\143\22\5"+
    "\24\0\2\5\4\0\1\5\2\0\1\144\27\5\24\0"+
    "\2\5\4\0\1\5\2\0\15\5\1\145\12\5\24\0"+
    "\2\5\4\0\1\5\2\0\3\5\1\146\24\5\24\0"+
    "\2\5\4\0\1\5\2\0\5\5\1\147\22\5\24\0"+
    "\2\5\4\0\1\5\2\0\7\5\1\150\20\5\24\0"+
    "\2\5\4\0\1\5\2\0\14\5\1\151\13\5\24\0"+
    "\2\5\4\0\1\5\2\0\11\5\1\152\16\5\24\0"+
    "\2\5\4\0\1\5\2\0\13\5\1\153\14\5\25\0"+
    "\1\154\4\0\1\155\1\156\55\0\2\5\4\0\1\5"+
    "\2\0\14\5\1\157\13\5\24\0\2\5\4\0\1\5"+
    "\2\0\5\5\1\160\22\5\24\0\2\5\4\0\1\5"+
    "\2\0\13\5\1\161\14\5\24\0\2\5\4\0\1\5"+
    "\2\0\11\5\1\162\16\5\24\0\2\5\4\0\1\5"+
    "\2\0\11\5\1\163\16\5\24\0\2\5\4\0\1\5"+
    "\2\0\1\164\27\5\24\0\2\5\4\0\1\5\2\0"+
    "\1\165\27\5\24\0\2\5\4\0\1\5\2\0\1\166"+
    "\27\5\24\0\2\5\4\0\1\5\2\0\23\5\1\167"+
    "\4\5\24\0\2\5\4\0\1\5\2\0\14\5\1\170"+
    "\13\5\24\0\2\5\4\0\1\5\2\0\1\171\27\5"+
    "\25\0\1\154\4\0\1\154\57\0\1\154\63\0\2\5"+
    "\4\0\1\5\2\0\15\5\1\172\12\5\24\0\2\5"+
    "\4\0\1\5\2\0\21\5\1\173\6\5\24\0\2\5"+
    "\4\0\1\5\2\0\2\5\1\174\25\5\24\0\2\5"+
    "\4\0\1\5\2\0\2\5\1\175\25\5\24\0\2\5"+
    "\4\0\1\5\2\0\4\5\1\176\23\5\24\0\2\5"+
    "\4\0\1\5\2\0\14\5\1\177\13\5\24\0\2\5"+
    "\4\0\1\5\2\0\27\5\1\200\24\0\2\5\4\0"+
    "\1\5\2\0\24\5\1\201\3\5\24\0\2\5\4\0"+
    "\1\5\2\0\5\5\1\202\22\5\24\0\2\5\4\0"+
    "\1\5\2\0\14\5\1\203\13\5\24\0\2\5\4\0"+
    "\1\5\2\0\30\5\1\204\23\0\2\5\4\0\1\5"+
    "\1\0\1\205\30\5\66\0\1\206\52\0\1\207\54\0"+
    "\1\210\70\0\1\211\50\0\1\212\73\0\1\213\101\0"+
    "\1\214\52\0\1\215\67\0\1\216\63\0\1\217\54\0"+
    "\1\220\75\0\1\221\33\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[5618];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\1\11\1\1\1\11\3\1\1\11\2\1\1\11"+
    "\17\1\4\11\1\1\4\11\5\1\2\11\1\0\1\1"+
    "\1\0\23\1\6\11\1\1\1\0\22\1\1\0\21\1"+
    "\1\11\1\0\25\1\2\0\1\11\12\0\1\11";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[145];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;
  
  /** 
   * The number of occupied positions in zzBuffer beyond zzEndRead.
   * When a lead/high surrogate has been read from the input stream
   * into the final zzBuffer position, this will have a value of 1;
   * otherwise, it will have a value of 0.
   */
  private int zzFinalHighSurrogate = 0;

  /* user code: */
    private ComplexSymbolFactory symbolFactory;
    
	public Lexer(Path file, ComplexSymbolFactory symbolFactory) throws IOException {
		this(Files.newBufferedReader(file));
        this.symbolFactory = symbolFactory;
    }  

    protected void emit_warning(String message){
    	System.out.println("scanner warning: " + message + " at : 2 "+
    			(yyline+1) + " " + (yycolumn+1) + " " + yychar);
    }

    protected void emit_error(String message){
    	System.out.println("scanner error: " + message + " at : 2" +
    			(yyline+1) + " " + (yycolumn+1) + " " + yychar);
    }


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public Lexer(java.io.Reader in) {
    this.zzReader = in;
  }


  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x110000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 180) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length - zzFinalHighSurrogate) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzBuffer.length*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
    }

    /* fill the buffer with new input */
    int requested = zzBuffer.length - zzEndRead;
    int numRead = zzReader.read(zzBuffer, zzEndRead, requested);

    /* not supposed to occur according to specification of java.io.Reader */
    if (numRead == 0) {
      throw new java.io.IOException("Reader returned 0 characters. See JFlex examples for workaround.");
    }
    if (numRead > 0) {
      zzEndRead += numRead;
      /* If numRead == requested, we might have requested to few chars to
         encode a full Unicode character. We assume that a Reader would
         otherwise never return half characters. */
      if (numRead == requested) {
        if (Character.isHighSurrogate(zzBuffer[zzEndRead - 1])) {
          --zzEndRead;
          zzFinalHighSurrogate = 1;
        }
      }
      /* potentially more input available */
      return false;
    }

    /* numRead < 0 ==> end of stream */
    return true;
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * Internal scan buffer is resized down to its initial length, if it has grown.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    zzFinalHighSurrogate = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
    if (zzBuffer.length > ZZ_BUFFERSIZE)
      zzBuffer = new char[ZZ_BUFFERSIZE];
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() throws java.io.IOException {
    if (!zzEOFDone) {
      zzEOFDone = true;
      yyclose();
    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public java_cup.runtime.Symbol next_token() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      boolean zzR = false;
      int zzCh;
      int zzCharCount;
      for (zzCurrentPosL = zzStartRead  ;
           zzCurrentPosL < zzMarkedPosL ;
           zzCurrentPosL += zzCharCount ) {
        zzCh = Character.codePointAt(zzBufferL, zzCurrentPosL, zzMarkedPosL);
        zzCharCount = Character.charCount(zzCh);
        switch (zzCh) {
        case '\u000B':
        case '\u000C':
        case '\u0085':
        case '\u2028':
        case '\u2029':
          yyline++;
          yycolumn = 0;
          zzR = false;
          break;
        case '\r':
          yyline++;
          yycolumn = 0;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
            yycolumn = 0;
          }
          break;
        default:
          zzR = false;
          yycolumn += zzCharCount;
        }
      }

      if (zzR) {
        // peek one character ahead if it is \n (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzEndReadL = zzEndRead;
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof) 
            zzPeek = false;
          else 
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        }
        if (zzPeek) yyline--;
      }
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
            zzCurrentPosL += Character.charCount(zzInput);
          }
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
            zzDoEOF();
          {     return symbolFactory.newSymbol("EOF", EOF);
 }
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1: 
            { throw new UnsupportedOperationException("ERROR: not recognized (" + yytext() + ")\n"
        + "line: " + yyline + "\n"
        + "column: " + yycolumn);
            }
          case 49: break;
          case 2: 
            { /* Não cria tokens */
            }
          case 50: break;
          case 3: 
            { return symbolFactory.newSymbol(yytext(), ID, yytext());
            }
          case 51: break;
          case 4: 
            { return symbolFactory.newSymbol(yytext(), INTEGER, Integer.parseInt(yytext()));
            }
          case 52: break;
          case 5: 
            { return symbolFactory.newSymbol(yytext(), SLASH);
            }
          case 53: break;
          case 6: 
            { return symbolFactory.newSymbol(yytext(), TIMES);
            }
          case 54: break;
          case 7: 
            { return symbolFactory.newSymbol(yytext(), MINUS);
            }
          case 55: break;
          case 8: 
            { return symbolFactory.newSymbol(yytext(), DOT);
            }
          case 56: break;
          case 9: 
            { return symbolFactory.newSymbol(yytext(), O_BRACK);
            }
          case 57: break;
          case 10: 
            { return symbolFactory.newSymbol(yytext(), C_BRACK);
            }
          case 58: break;
          case 11: 
            { return symbolFactory.newSymbol(yytext(), SEMICOLON);
            }
          case 59: break;
          case 12: 
            { return symbolFactory.newSymbol(yytext(), COMMA);
            }
          case 60: break;
          case 13: 
            { return symbolFactory.newSymbol(yytext(), ASSIGN);
            }
          case 61: break;
          case 14: 
            { return symbolFactory.newSymbol(yytext(), O_PAR);
            }
          case 62: break;
          case 15: 
            { return symbolFactory.newSymbol(yytext(), C_PAR);
            }
          case 63: break;
          case 16: 
            { return symbolFactory.newSymbol(yytext(), O_BRAC);
            }
          case 64: break;
          case 17: 
            { return symbolFactory.newSymbol(yytext(), C_BRAC);
            }
          case 65: break;
          case 18: 
            { return symbolFactory.newSymbol(yytext(), OPP);
            }
          case 66: break;
          case 19: 
            { return symbolFactory.newSymbol(yytext(), LESS);
            }
          case 67: break;
          case 20: 
            { return symbolFactory.newSymbol(yytext(), GREATER);
            }
          case 68: break;
          case 21: 
            { return symbolFactory.newSymbol(yytext(), PLUS);
            }
          case 69: break;
          case 22: 
            { return symbolFactory.newSymbol(yytext(), PERCENT);
            }
          case 70: break;
          case 23: 
            { return symbolFactory.newSymbol(yytext(), IF);
            }
          case 71: break;
          case 24: 
            { return symbolFactory.newSymbol(yytext(), EQUALS);
            }
          case 72: break;
          case 25: 
            { return symbolFactory.newSymbol(yytext(), OR);
            }
          case 73: break;
          case 26: 
            { return symbolFactory.newSymbol(yytext(), AND);
            }
          case 74: break;
          case 27: 
            { return symbolFactory.newSymbol(yytext(), DIFF);
            }
          case 75: break;
          case 28: 
            { return symbolFactory.newSymbol(yytext(), LESS_EQ);
            }
          case 76: break;
          case 29: 
            { return symbolFactory.newSymbol(yytext(), GREATER_EQ);
            }
          case 77: break;
          case 78: break;
          case 31: 
            { return symbolFactory.newSymbol(yytext(), INT);
            }
          case 79: break;
          case 32: 
            { return symbolFactory.newSymbol(yytext(), NEW);
            }
          case 80: break;
          case 33: 
            { return symbolFactory.newSymbol(yytext(), ELSE);
            }
          case 81: break;
          case 34: 
            { return symbolFactory.newSymbol(yytext(), THIS);
            }
          case 82: break;
          case 35: 
            { return symbolFactory.newSymbol(yytext(), TRUE, true);
            }
          case 83: break;
          case 36: 
            { return symbolFactory.newSymbol(yytext(), VOID);
            }
          case 84: break;
          case 37: 
            { return symbolFactory.newSymbol(yytext(), MAIN);
            }
          case 85: break;
          case 38: 
            { return symbolFactory.newSymbol(yytext(), CLASS);
            }
          case 86: break;
          case 39: 
            { return symbolFactory.newSymbol(yytext(), WHILE);
            }
          case 87: break;
          case 40: 
            { return symbolFactory.newSymbol(yytext(), FALSE, false);
            }
          case 88: break;
          case 41: 
            { return symbolFactory.newSymbol(yytext(), LENGTH);
            }
          case 89: break;
          case 42: 
            { return symbolFactory.newSymbol(yytext(), STATIC);
            }
          case 90: break;
          case 43: 
            { return symbolFactory.newSymbol(yytext(), PUBLIC);
            }
          case 91: break;
          case 44: 
            { return symbolFactory.newSymbol(yytext(), RETURN);
            }
          case 92: break;
          case 45: 
            { return symbolFactory.newSymbol(yytext(), EXTENDS);
            }
          case 93: break;
          case 46: 
            { return symbolFactory.newSymbol(yytext(), BOOLEAN);
            }
          case 94: break;
          case 47: 
            { return symbolFactory.newSymbol(yytext(), STRGARG);
            }
          case 95: break;
          case 48: 
            { return symbolFactory.newSymbol(yytext(), PRINTLN);
            }
          case 96: break;
          default:
            zzScanError(ZZ_NO_MATCH);
        }
      }
    }
  }


}
