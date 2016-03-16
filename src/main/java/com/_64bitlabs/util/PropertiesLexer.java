/* The following code was generated by JFlex 1.4.3 on 2/18/15 12:28 PM */

/* PropertiesLexer.java is a generated file.  You probably want to
 * edit PropertiesLexer.lex to make changes.  Use JFlex to generate it.
 * To generate PropertiesLexer.java
 * JFlex may be obtained from
 * <a href="http://jflex.de">the JFlex website</a>.
 * JFlex 1.4 or later is required.
 * Run:<br>
 * jflex  PropertiesLexer.lex<br>
 * You will then have a file called PropertiesLexer.java
 */

/*
 * Goes with UberProperties
 * Copyright (C) 2014-2016 Tolga Yilmaz
 * info@64bitlabs.com
 *
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * See LICENSE.txt for details.
 */

package com._64bitlabs.util;

import java.io.*;

/**
 * PropertiesLexer is a Java Properties file lexer.  Created with JFlex.  An example of how it is used:
 *  <CODE>
 *  <PRE>
 *  PropertiesLexer shredder = new PropertiesLexer(System.in);
 *  PropertiesToken t;
 *  while ((t = shredder.getNextToken()) != null){
 *	  System.out.println(t);
 *  }
 *  </PRE>
 *  </CODE>
 *
 * @see com._64bitlabs.util.PropertiesToken
 * @author Tolga Yilmaz info@64bitlabs.com
 * @since 64bitlabsutils 1.0.0
 */


class PropertiesLexer {

  /** This character denotes the end of file */
  private static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  private static final int SEPARATOR = 14;
  private static final int DONE = 20;
  private static final int MID_NAME = 10;
  private static final int MID_NAME_NEW_LINE = 12;
  private static final int VALUE = 16;
  private static final int MID_VALUE = 18;
  private static final int NAME_SPACE = 8;
  private static final int YYINITIAL = 0;
  private static final int WHITE_SPACE = 4;
  private static final int LINE_END = 2;
  private static final int NAME = 6;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = {
     0,  0,  1,  1,  2,  2,  3,  3,  4,  4,  5,  5,  6,  6,  7,  7,
     8,  8,  7,  7,  9, 9
  };

  /**
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED =
    "\11\0\1\1\1\4\1\0\1\1\1\3\22\0\1\1\1\6\1\0"+
    "\1\6\14\0\12\0\1\5\2\0\1\5\3\0\6\0\25\0\1\2"+
    "\4\0\6\0\16\0\1\0\uff8a\0";

  /**
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /**
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\1\1\0\1\1\2\2\2\1\1\2\1\0\1\3"+
    "\1\1\1\4\1\5\2\6\1\7\1\10\1\11\1\5"+
    "\1\2\1\12\3\5\1\13\1\14\2\5\2\0\2\15"+
    "\2\16\2\17";

  private static int [] zzUnpackAction() {
    int [] result = new int[36];
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
    "\0\0\0\7\0\16\0\25\0\34\0\43\0\52\0\61"+
    "\0\70\0\77\0\106\0\115\0\124\0\133\0\142\0\142"+
    "\0\151\0\142\0\142\0\160\0\167\0\176\0\205\0\214"+
    "\0\223\0\232\0\241\0\250\0\124\0\257\0\266\0\142"+
    "\0\275\0\142\0\304\0\142";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[36];
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
    "\1\13\1\14\1\15\1\16\1\17\1\20\1\21\2\22"+
    "\1\23\1\16\1\17\2\22\1\13\1\22\1\15\1\16"+
    "\1\17\1\20\1\13\1\24\1\25\1\26\1\16\1\17"+
    "\1\20\2\24\1\25\1\27\1\16\1\17\1\20\1\24"+
    "\1\13\1\22\1\30\1\16\1\17\1\20\2\13\1\31"+
    "\1\30\1\16\1\17\1\20\1\13\1\24\1\32\1\33"+
    "\1\16\1\17\2\24\1\22\1\32\1\34\1\16\1\17"+
    "\2\22\7\12\1\13\1\0\1\35\3\0\1\13\1\0"+
    "\1\14\4\0\1\21\3\13\2\0\2\13\4\0\1\17"+
    "\11\0\3\21\2\0\2\21\2\24\1\36\2\0\2\24"+
    "\1\0\1\25\5\0\3\24\1\37\1\40\5\24\1\41"+
    "\1\42\2\24\3\13\1\37\1\40\2\13\1\0\1\31"+
    "\6\0\1\32\5\0\3\24\1\43\1\44\2\24\3\0"+
    "\1\43\1\44\2\0\3\24\2\0\2\24\4\0\1\40"+
    "\6\0\1\42\6\0\1\44\2\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[203];
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
    "Unkown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\1\1\0\6\1\1\0\5\1\2\11\1\1\2\11"+
    "\11\1\2\0\1\1\1\11\1\1\1\11\1\1\1\11";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[36];
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
  private Reader zzReader;

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

  /* user code: */
	private int lastToken;
	private int nextState=YYINITIAL;

	/**
	 * Prints out tokens from a file or System.in.
	 * If no arguments are given, System.in will be used for input.
	 * If more arguments are given, the first argument will be used as
	 * the name of the file to use as input
	 *
	 * @param args program arguments, of which the first is a filename
	 *
	 * @since 64bitlabsutils 1.0.0
	 */
	public static void main(String[] args) {
		InputStream in;
		try {
			if (args.length > 0){
				File f = new File(args[0]);
				if (f.exists()){
					if (f.canRead()){
						in = new FileInputStream(f);
					} else {
						throw new IOException("Could not open " + args[0]);
					}
				} else {
					throw new IOException("Could not find " + args[0]);
				}
			} else {
				in = System.in;
			}
			PropertiesLexer shredder = new PropertiesLexer(in);
			PropertiesToken t;
			while ((t = shredder.getNextToken()) != null) {
				if (true || t.getID() != PropertiesToken.WHITE_SPACE){
					System.out.println(t);
				}
			}
		} catch (IOException e){
			System.err.println(e.getMessage());
		}
	}

	/**
	 * Return the next token from the properties.
	 *
	 * @return the next token
	 * @throws java.io.IOException if an error occurs while reading the properties.
	 */
	public PropertiesToken getNextToken() throws IOException {
		return getToken();
	}



  /**
   * Creates a new scanner
   * There is also a java.io.InputStream version of this constructor.
   *
   * @param   in  the java.io.Reader to read input from.
   */
  PropertiesLexer(Reader in) {
    this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  PropertiesLexer(InputStream in) {
    this(new InputStreamReader(in));
  }

  /**
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x10000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 50) {
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
  private boolean zzRefill() throws IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
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
    if (zzCurrentPos >= zzBuffer.length) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzCurrentPos*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
    }

    /* finally: fill the buffer with new input */
    int numRead = zzReader.read(zzBuffer, zzEndRead,
                                            zzBuffer.length-zzEndRead);

    if (numRead > 0) {
      zzEndRead+= numRead;
      return false;
    }
    // unlikely but not impossible: read 0 characters, but not at end of stream
    if (numRead == 0) {
      int c = zzReader.read();
      if (c == -1) {
        return true;
      } else {
        zzBuffer[zzEndRead++] = (char) c;
        return false;
      }
    }

	// numRead < 0
    return true;
  }


  /**
   * Closes the input stream.
   */
  private final void yyclose() throws IOException {
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
   * @param reader   the new input stream
   */
  private final void yyreset(Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
  }


  /**
   * Returns the current lexical state.
   */
  private final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  private final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  private final String yytext() {
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
  private final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  private final int yylength() {
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
  private void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private PropertiesToken getToken() throws IOException {
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

      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = ZZ_LEXSTATE[zzLexicalState];


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL)
            zzInput = zzBufferL[zzCurrentPosL++];
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
              zzInput = zzBufferL[zzCurrentPosL++];
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          int zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
        case 6: 
          { nextState = YYINITIAL;
	lastToken = PropertiesToken.END_LINE_WHITE_SPACE;
	String text = yytext();
	PropertiesToken t = new PropertiesToken(lastToken,text);
	yybegin(nextState);
	return (t);
          }
        case 16: break;
        case 10: 
          { nextState = NAME_SPACE;
	lastToken = PropertiesToken.WHITE_SPACE;
	String text = yytext();
	PropertiesToken t = new PropertiesToken(lastToken,text);
	yybegin(nextState);
	return (t);
          }
        case 17: break;
        case 1: 
          { nextState = NAME;
	lastToken = PropertiesToken.NAME;
	String text = yytext();
	PropertiesToken t = new PropertiesToken(lastToken,text);
	yybegin(nextState);
	return (t);
          }
        case 18: break;
        case 13: 
          { nextState = MID_NAME_NEW_LINE;
	lastToken = PropertiesToken.CONTINUE_LINE;
	String text = yytext();
	PropertiesToken t = new PropertiesToken(lastToken,text);
	yybegin(nextState);
	return (t);
          }
        case 19: break;
        case 11: 
          { nextState = MID_NAME;
	lastToken = PropertiesToken.WHITE_SPACE;
	String text = yytext();
	PropertiesToken t = new PropertiesToken(lastToken,text);
	yybegin(nextState);
	return (t);
          }
        case 20: break;
        case 15: 
          { nextState = MID_VALUE;
	lastToken = PropertiesToken.CONTINUE_LINE;
	String text = yytext();
	PropertiesToken t = new PropertiesToken(lastToken,text);
	yybegin(nextState);
	return (t);
          }
        case 21: break;
        case 9: 
          { System.err.println("Unmatched input.");
	String state = "";
	String text = yytext();
	switch (nextState){
		case YYINITIAL: state = "YYINITIAL"; break;
		case LINE_END: state = "LINE_END"; break;
		case WHITE_SPACE: state = "WHITE_SPACE"; break;
		case NAME: state = "NAME"; break;
		case SEPARATOR: state = "SEPARATOR"; break;
		case VALUE: state = "VALUE"; break;
		case MID_NAME: state = "MID_NAME"; break;
		case NAME_SPACE: state = "NAME_SPACE"; break;
	}
	System.err.println("State: '" + state + "'");
	System.err.println("Text: '" + text + "'");
	zzScanError(ZZ_NO_MATCH);
          }
        case 22: break;
        case 4: 
          { nextState = WHITE_SPACE;
	lastToken = PropertiesToken.WHITE_SPACE;
	String text = yytext();
	PropertiesToken t = new PropertiesToken(lastToken,text);
	yybegin(nextState);
	return (t);
          }
        case 23: break;
        case 8: 
          { nextState = LINE_END;
	lastToken = PropertiesToken.COMMENT;
	String text = yytext();
	PropertiesToken t = new PropertiesToken(lastToken,text);
	yybegin(nextState);
	return (t);
          }
        case 24: break;
        case 5: 
          { // Ignore escape characters at the end of the file.
          }
        case 25: break;
        case 12: 
          { lastToken = PropertiesToken.WHITE_SPACE;
	String text = yytext();
	PropertiesToken t = new PropertiesToken(lastToken,text);
	return (t);
          }
        case 26: break;
        case 14: 
          { lastToken = PropertiesToken.CONTINUE_LINE;
	String text = yytext();
	PropertiesToken t = new PropertiesToken(lastToken,text);
	return (t);
          }
        case 27: break;
        case 7: 
          { nextState = SEPARATOR;
	lastToken = PropertiesToken.SEPARATOR;
	String text = yytext();
	PropertiesToken t = new PropertiesToken(lastToken,text);
	yybegin(nextState);
	return (t);
          }
        case 28: break;
        case 3: 
          { return null;
          }
        case 29: break;
        case 2: 
          { nextState = VALUE;
	lastToken = PropertiesToken.VALUE;
	String text = yytext();
	PropertiesToken t = new PropertiesToken(lastToken,text);
	yybegin(nextState);
	return (t);
          }
        case 30: break;
        default: 
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            switch (zzLexicalState) {
            case SEPARATOR: {
              nextState = DONE;
	lastToken = PropertiesToken.END_LINE_WHITE_SPACE;
	PropertiesToken t = new PropertiesToken(lastToken,"");
	yybegin(nextState);
	return (t);
            }
            case 37: break;
            case MID_NAME: {
              nextState = DONE;
	lastToken = PropertiesToken.END_LINE_WHITE_SPACE;
	PropertiesToken t = new PropertiesToken(lastToken,"");
	yybegin(nextState);
	return (t);
            }
            case 38: break;
            case MID_NAME_NEW_LINE: {
              nextState = DONE;
	lastToken = PropertiesToken.END_LINE_WHITE_SPACE;
	PropertiesToken t = new PropertiesToken(lastToken,"");
	yybegin(nextState);
	return (t);
            }
            case 39: break;
            case VALUE: {
              nextState = DONE;
	lastToken = PropertiesToken.END_LINE_WHITE_SPACE;
	PropertiesToken t = new PropertiesToken(lastToken,"");
	yybegin(nextState);
	return (t);
            }
            case 40: break;
            case MID_VALUE: {
              nextState = DONE;
	lastToken = PropertiesToken.END_LINE_WHITE_SPACE;
	PropertiesToken t = new PropertiesToken(lastToken,"");
	yybegin(nextState);
	return (t);
            }
            case 41: break;
            case NAME_SPACE: {
              nextState = DONE;
	lastToken = PropertiesToken.END_LINE_WHITE_SPACE;
	PropertiesToken t = new PropertiesToken(lastToken,"");
	yybegin(nextState);
	return (t);
            }
            case 42: break;
            case YYINITIAL: {
              nextState = DONE;
	lastToken = PropertiesToken.END_LINE_WHITE_SPACE;
	PropertiesToken t = new PropertiesToken(lastToken,"");
	yybegin(nextState);
	return (t);
            }
            case 43: break;
            case WHITE_SPACE: {
              nextState = DONE;
	lastToken = PropertiesToken.END_LINE_WHITE_SPACE;
	PropertiesToken t = new PropertiesToken(lastToken,"");
	yybegin(nextState);
	return (t);
            }
            case 44: break;
            case LINE_END: {
              nextState = DONE;
	lastToken = PropertiesToken.END_LINE_WHITE_SPACE;
	PropertiesToken t = new PropertiesToken(lastToken,"");
	yybegin(nextState);
	return (t);
            }
            case 45: break;
            case NAME: {
              nextState = DONE;
	lastToken = PropertiesToken.END_LINE_WHITE_SPACE;
	PropertiesToken t = new PropertiesToken(lastToken,"");
	yybegin(nextState);
	return (t);
            }
            case 46: break;
            default:
            return null;
            }
          } 
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
