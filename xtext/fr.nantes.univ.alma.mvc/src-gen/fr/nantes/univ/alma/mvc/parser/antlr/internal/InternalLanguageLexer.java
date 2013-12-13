package fr.nantes.univ.alma.mvc.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalLanguageLexer extends Lexer {
    public static final int T__40=40;
    public static final int RULE_ID=6;
    public static final int T__41=41;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=11;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int EOF=-1;
    public static final int RULE_SL_COMMENT=9;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__19=19;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int RULE_VERSION=4;
    public static final int T__32=32;
    public static final int RULE_STRING=5;
    public static final int T__16=16;
    public static final int T__33=33;
    public static final int T__15=15;
    public static final int T__34=34;
    public static final int T__18=18;
    public static final int T__35=35;
    public static final int T__17=17;
    public static final int T__36=36;
    public static final int T__12=12;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__14=14;
    public static final int T__39=39;
    public static final int T__13=13;
    public static final int RULE_INT=7;
    public static final int RULE_WS=10;

    // delegates
    // delegators

    public InternalLanguageLexer() {;} 
    public InternalLanguageLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalLanguageLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g"; }

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:11:7: ( '<UIApplication>' )
            // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:11:9: '<UIApplication>'
            {
            match("<UIApplication>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__12"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:12:7: ( '<models>' )
            // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:12:9: '<models>'
            {
            match("<models>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:13:7: ( '<model ref=' )
            // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:13:9: '<model ref='
            {
            match("<model ref="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:14:7: ( ' />' )
            // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:14:9: ' />'
            {
            match(" />"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:15:7: ( '</models>' )
            // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:15:9: '</models>'
            {
            match("</models>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:16:7: ( '<pages>' )
            // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:16:9: '<pages>'
            {
            match("<pages>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:17:7: ( '<page ref=' )
            // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:17:9: '<page ref='
            {
            match("<page ref="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:18:7: ( '</pages>' )
            // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:18:9: '</pages>'
            {
            match("</pages>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:19:7: ( '</UIApplication>' )
            // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:19:9: '</UIApplication>'
            {
            match("</UIApplication>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:20:7: ( '<?xml version=' )
            // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:20:9: '<?xml version='
            {
            match("<?xml version="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:21:7: ( ' encoding=' )
            // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:21:9: ' encoding='
            {
            match(" encoding="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:22:7: ( ' ?>' )
            // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:22:9: ' ?>'
            {
            match(" ?>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:23:7: ( '<view name=' )
            // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:23:9: '<view name='
            {
            match("<view name="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:24:7: ( ' >' )
            // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:24:9: ' >'
            {
            match(" >"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:25:7: ( '<description>' )
            // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:25:9: '<description>'
            {
            match("<description>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:26:7: ( '</description>' )
            // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:26:9: '</description>'
            {
            match("</description>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:27:7: ( '<actions>' )
            // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:27:9: '<actions>'
            {
            match("<actions>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:28:7: ( '</actions>' )
            // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:28:9: '</actions>'
            {
            match("</actions>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:29:7: ( '</view>' )
            // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:29:9: '</view>'
            {
            match("</view>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:30:7: ( '<model name=' )
            // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:30:9: '<model name='
            {
            match("<model name="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:31:7: ( '<properties>' )
            // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:31:9: '<properties>'
            {
            match("<properties>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:32:7: ( '</properties>' )
            // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:32:9: '</properties>'
            {
            match("</properties>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:33:7: ( '<ownedElements>' )
            // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:33:9: '<ownedElements>'
            {
            match("<ownedElements>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:34:7: ( '</ownedElements>' )
            // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:34:9: '</ownedElements>'
            {
            match("</ownedElements>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:35:7: ( '</model>' )
            // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:35:9: '</model>'
            {
            match("</model>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:36:7: ( '<action name=' )
            // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:36:9: '<action name='
            {
            match("<action name="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:37:7: ( '<nextPage ref=' )
            // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:37:9: '<nextPage ref='
            {
            match("<nextPage ref="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:38:7: ( '</action>' )
            // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:38:9: '</action>'
            {
            match("</action>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:39:7: ( '<modelProperty name=' )
            // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:39:9: '<modelProperty name='
            {
            match("<modelProperty name="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:40:7: ( '.' )
            // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:40:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "RULE_VERSION"
    public final void mRULE_VERSION() throws RecognitionException {
        try {
            int _type = RULE_VERSION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:837:14: ( '\"' ( '0' .. '9' )+ '.' ( '0' .. '9' )+ '\"' )
            // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:837:16: '\"' ( '0' .. '9' )+ '.' ( '0' .. '9' )+ '\"'
            {
            match('\"'); 
            // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:837:20: ( '0' .. '9' )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='0' && LA1_0<='9')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:837:21: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);

            match('.'); 
            // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:837:36: ( '0' .. '9' )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:837:37: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);

            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_VERSION"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:839:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:839:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:839:11: ( '^' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='^') ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:839:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:839:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='0' && LA4_0<='9')||(LA4_0>='A' && LA4_0<='Z')||LA4_0=='_'||(LA4_0>='a' && LA4_0<='z')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:841:10: ( ( '0' .. '9' )+ )
            // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:841:12: ( '0' .. '9' )+
            {
            // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:841:12: ( '0' .. '9' )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='0' && LA5_0<='9')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:841:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:843:13: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:843:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:843:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='\"') ) {
                alt8=1;
            }
            else if ( (LA8_0=='\'') ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:843:16: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:843:20: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop6:
                    do {
                        int alt6=3;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0=='\\') ) {
                            alt6=1;
                        }
                        else if ( ((LA6_0>='\u0000' && LA6_0<='!')||(LA6_0>='#' && LA6_0<='[')||(LA6_0>=']' && LA6_0<='\uFFFF')) ) {
                            alt6=2;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:843:21: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||(input.LA(1)>='t' && input.LA(1)<='u') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:843:66: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:843:86: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:843:91: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop7:
                    do {
                        int alt7=3;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0=='\\') ) {
                            alt7=1;
                        }
                        else if ( ((LA7_0>='\u0000' && LA7_0<='&')||(LA7_0>='(' && LA7_0<='[')||(LA7_0>=']' && LA7_0<='\uFFFF')) ) {
                            alt7=2;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:843:92: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||(input.LA(1)>='t' && input.LA(1)<='u') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:843:137: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:845:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:845:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:845:24: ( options {greedy=false; } : . )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0=='*') ) {
                    int LA9_1 = input.LA(2);

                    if ( (LA9_1=='/') ) {
                        alt9=2;
                    }
                    else if ( ((LA9_1>='\u0000' && LA9_1<='.')||(LA9_1>='0' && LA9_1<='\uFFFF')) ) {
                        alt9=1;
                    }


                }
                else if ( ((LA9_0>='\u0000' && LA9_0<=')')||(LA9_0>='+' && LA9_0<='\uFFFF')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:845:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:847:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:847:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:847:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>='\u0000' && LA10_0<='\t')||(LA10_0>='\u000B' && LA10_0<='\f')||(LA10_0>='\u000E' && LA10_0<='\uFFFF')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:847:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:847:40: ( ( '\\r' )? '\\n' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0=='\n'||LA12_0=='\r') ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:847:41: ( '\\r' )? '\\n'
                    {
                    // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:847:41: ( '\\r' )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0=='\r') ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:847:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:849:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:849:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:849:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt13=0;
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>='\t' && LA13_0<='\n')||LA13_0=='\r'||LA13_0==' ') ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt13 >= 1 ) break loop13;
                        EarlyExitException eee =
                            new EarlyExitException(13, input);
                        throw eee;
                }
                cnt13++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:851:16: ( . )
            // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:851:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:1:8: ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | RULE_VERSION | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt14=38;
        alt14 = dfa14.predict(input);
        switch (alt14) {
            case 1 :
                // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:1:10: T__12
                {
                mT__12(); 

                }
                break;
            case 2 :
                // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:1:16: T__13
                {
                mT__13(); 

                }
                break;
            case 3 :
                // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:1:22: T__14
                {
                mT__14(); 

                }
                break;
            case 4 :
                // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:1:28: T__15
                {
                mT__15(); 

                }
                break;
            case 5 :
                // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:1:34: T__16
                {
                mT__16(); 

                }
                break;
            case 6 :
                // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:1:40: T__17
                {
                mT__17(); 

                }
                break;
            case 7 :
                // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:1:46: T__18
                {
                mT__18(); 

                }
                break;
            case 8 :
                // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:1:52: T__19
                {
                mT__19(); 

                }
                break;
            case 9 :
                // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:1:58: T__20
                {
                mT__20(); 

                }
                break;
            case 10 :
                // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:1:64: T__21
                {
                mT__21(); 

                }
                break;
            case 11 :
                // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:1:70: T__22
                {
                mT__22(); 

                }
                break;
            case 12 :
                // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:1:76: T__23
                {
                mT__23(); 

                }
                break;
            case 13 :
                // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:1:82: T__24
                {
                mT__24(); 

                }
                break;
            case 14 :
                // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:1:88: T__25
                {
                mT__25(); 

                }
                break;
            case 15 :
                // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:1:94: T__26
                {
                mT__26(); 

                }
                break;
            case 16 :
                // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:1:100: T__27
                {
                mT__27(); 

                }
                break;
            case 17 :
                // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:1:106: T__28
                {
                mT__28(); 

                }
                break;
            case 18 :
                // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:1:112: T__29
                {
                mT__29(); 

                }
                break;
            case 19 :
                // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:1:118: T__30
                {
                mT__30(); 

                }
                break;
            case 20 :
                // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:1:124: T__31
                {
                mT__31(); 

                }
                break;
            case 21 :
                // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:1:130: T__32
                {
                mT__32(); 

                }
                break;
            case 22 :
                // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:1:136: T__33
                {
                mT__33(); 

                }
                break;
            case 23 :
                // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:1:142: T__34
                {
                mT__34(); 

                }
                break;
            case 24 :
                // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:1:148: T__35
                {
                mT__35(); 

                }
                break;
            case 25 :
                // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:1:154: T__36
                {
                mT__36(); 

                }
                break;
            case 26 :
                // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:1:160: T__37
                {
                mT__37(); 

                }
                break;
            case 27 :
                // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:1:166: T__38
                {
                mT__38(); 

                }
                break;
            case 28 :
                // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:1:172: T__39
                {
                mT__39(); 

                }
                break;
            case 29 :
                // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:1:178: T__40
                {
                mT__40(); 

                }
                break;
            case 30 :
                // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:1:184: T__41
                {
                mT__41(); 

                }
                break;
            case 31 :
                // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:1:190: RULE_VERSION
                {
                mRULE_VERSION(); 

                }
                break;
            case 32 :
                // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:1:203: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 33 :
                // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:1:211: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 34 :
                // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:1:220: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 35 :
                // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:1:232: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 36 :
                // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:1:248: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 37 :
                // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:1:264: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 38 :
                // ../fr.nantes.univ.alma.mvc/src-gen/fr/nantes/univ/alma/mvc/parser/antlr/internal/InternalLanguage.g:1:272: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA14 dfa14 = new DFA14(this);
    static final String DFA14_eotS =
        "\1\uffff\1\13\1\32\1\uffff\2\13\2\uffff\2\13\110\uffff";
    static final String DFA14_eofS =
        "\122\uffff";
    static final String DFA14_minS =
        "\1\0\2\57\1\uffff\1\0\1\101\2\uffff\1\0\1\52\3\uffff\1\157\1\125"+
        "\1\141\3\uffff\1\143\11\uffff\1\0\4\uffff\1\144\1\157\1\141\2\uffff"+
        "\1\143\2\uffff\1\147\1\uffff\1\164\1\0\1\145\1\144\2\uffff\1\164"+
        "\1\145\1\151\1\0\1\154\1\145\1\151\1\40\1\157\1\uffff\1\40\1\154"+
        "\1\157\2\uffff\1\156\2\uffff\1\156\1\uffff\1\76\1\156\1\40\4\uffff"+
        "\1\76\4\uffff";
    static final String DFA14_maxS =
        "\1\uffff\1\166\1\145\1\uffff\1\uffff\1\172\2\uffff\1\uffff\1\57"+
        "\3\uffff\1\157\1\166\1\162\3\uffff\1\143\11\uffff\1\uffff\4\uffff"+
        "\1\144\1\157\1\162\2\uffff\1\143\2\uffff\1\147\1\uffff\1\164\1\uffff"+
        "\1\145\1\144\2\uffff\1\164\1\145\1\151\1\uffff\1\154\1\145\1\151"+
        "\1\163\1\157\1\uffff\1\163\1\154\1\157\2\uffff\1\156\2\uffff\1\162"+
        "\1\uffff\1\163\1\156\1\163\4\uffff\1\163\4\uffff";
    static final String DFA14_acceptS =
        "\3\uffff\1\36\2\uffff\1\40\1\41\2\uffff\1\45\1\46\1\1\3\uffff\1"+
        "\12\1\15\1\17\1\uffff\1\27\1\33\1\4\1\13\1\14\1\16\1\45\1\36\1\42"+
        "\1\uffff\1\40\1\41\1\43\1\44\3\uffff\1\11\1\20\1\uffff\1\23\1\30"+
        "\1\uffff\1\25\4\uffff\1\10\1\26\11\uffff\1\37\3\uffff\1\6\1\7\1"+
        "\uffff\1\37\1\2\1\uffff\1\35\3\uffff\1\3\1\24\1\5\1\31\1\uffff\1"+
        "\21\1\32\1\22\1\34";
    static final String DFA14_specialS =
        "\1\0\3\uffff\1\3\3\uffff\1\4\24\uffff\1\5\17\uffff\1\2\7\uffff\1"+
        "\1\34\uffff}>";
    static final String[] DFA14_transitionS = {
            "\11\13\2\12\2\13\1\12\22\13\1\2\1\13\1\4\4\13\1\10\6\13\1\3"+
            "\1\11\12\7\2\13\1\1\4\13\32\6\3\13\1\5\1\6\1\13\32\6\uff85\13",
            "\1\16\17\uffff\1\20\25\uffff\1\14\13\uffff\1\23\2\uffff\1\22"+
            "\10\uffff\1\15\1\25\1\24\1\17\5\uffff\1\21",
            "\1\26\16\uffff\1\31\1\30\45\uffff\1\27",
            "",
            "\60\34\12\35\uffc6\34",
            "\32\36\4\uffff\1\36\1\uffff\32\36",
            "",
            "",
            "\0\34",
            "\1\40\4\uffff\1\41",
            "",
            "",
            "",
            "\1\42",
            "\1\45\13\uffff\1\47\2\uffff\1\46\10\uffff\1\43\1\uffff\1\51"+
            "\1\44\5\uffff\1\50",
            "\1\52\20\uffff\1\53",
            "",
            "",
            "",
            "\1\54",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\56\34\1\55\1\34\12\35\uffc6\34",
            "",
            "",
            "",
            "",
            "\1\56",
            "\1\57",
            "\1\60\20\uffff\1\61",
            "",
            "",
            "\1\62",
            "",
            "",
            "\1\63",
            "",
            "\1\64",
            "\60\34\12\65\uffc6\34",
            "\1\66",
            "\1\67",
            "",
            "",
            "\1\70",
            "\1\71",
            "\1\72",
            "\42\34\1\73\15\34\12\65\uffc6\34",
            "\1\74",
            "\1\75",
            "\1\76",
            "\1\100\122\uffff\1\77",
            "\1\101",
            "",
            "\1\104\57\uffff\1\105\42\uffff\1\103",
            "\1\106",
            "\1\107",
            "",
            "",
            "\1\110",
            "",
            "",
            "\1\112\3\uffff\1\111",
            "",
            "\1\114\64\uffff\1\113",
            "\1\115",
            "\1\117\122\uffff\1\116",
            "",
            "",
            "",
            "",
            "\1\121\64\uffff\1\120",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA14_eot = DFA.unpackEncodedString(DFA14_eotS);
    static final short[] DFA14_eof = DFA.unpackEncodedString(DFA14_eofS);
    static final char[] DFA14_min = DFA.unpackEncodedStringToUnsignedChars(DFA14_minS);
    static final char[] DFA14_max = DFA.unpackEncodedStringToUnsignedChars(DFA14_maxS);
    static final short[] DFA14_accept = DFA.unpackEncodedString(DFA14_acceptS);
    static final short[] DFA14_special = DFA.unpackEncodedString(DFA14_specialS);
    static final short[][] DFA14_transition;

    static {
        int numStates = DFA14_transitionS.length;
        DFA14_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA14_transition[i] = DFA.unpackEncodedString(DFA14_transitionS[i]);
        }
    }

    class DFA14 extends DFA {

        public DFA14(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 14;
            this.eot = DFA14_eot;
            this.eof = DFA14_eof;
            this.min = DFA14_min;
            this.max = DFA14_max;
            this.accept = DFA14_accept;
            this.special = DFA14_special;
            this.transition = DFA14_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | RULE_VERSION | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA14_0 = input.LA(1);

                        s = -1;
                        if ( (LA14_0=='<') ) {s = 1;}

                        else if ( (LA14_0==' ') ) {s = 2;}

                        else if ( (LA14_0=='.') ) {s = 3;}

                        else if ( (LA14_0=='\"') ) {s = 4;}

                        else if ( (LA14_0=='^') ) {s = 5;}

                        else if ( ((LA14_0>='A' && LA14_0<='Z')||LA14_0=='_'||(LA14_0>='a' && LA14_0<='z')) ) {s = 6;}

                        else if ( ((LA14_0>='0' && LA14_0<='9')) ) {s = 7;}

                        else if ( (LA14_0=='\'') ) {s = 8;}

                        else if ( (LA14_0=='/') ) {s = 9;}

                        else if ( ((LA14_0>='\t' && LA14_0<='\n')||LA14_0=='\r') ) {s = 10;}

                        else if ( ((LA14_0>='\u0000' && LA14_0<='\b')||(LA14_0>='\u000B' && LA14_0<='\f')||(LA14_0>='\u000E' && LA14_0<='\u001F')||LA14_0=='!'||(LA14_0>='#' && LA14_0<='&')||(LA14_0>='(' && LA14_0<='-')||(LA14_0>=':' && LA14_0<=';')||(LA14_0>='=' && LA14_0<='@')||(LA14_0>='[' && LA14_0<=']')||LA14_0=='`'||(LA14_0>='{' && LA14_0<='\uFFFF')) ) {s = 11;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA14_53 = input.LA(1);

                        s = -1;
                        if ( (LA14_53=='\"') ) {s = 59;}

                        else if ( ((LA14_53>='0' && LA14_53<='9')) ) {s = 53;}

                        else if ( ((LA14_53>='\u0000' && LA14_53<='!')||(LA14_53>='#' && LA14_53<='/')||(LA14_53>=':' && LA14_53<='\uFFFF')) ) {s = 28;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA14_45 = input.LA(1);

                        s = -1;
                        if ( ((LA14_45>='0' && LA14_45<='9')) ) {s = 53;}

                        else if ( ((LA14_45>='\u0000' && LA14_45<='/')||(LA14_45>=':' && LA14_45<='\uFFFF')) ) {s = 28;}

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA14_4 = input.LA(1);

                        s = -1;
                        if ( ((LA14_4>='\u0000' && LA14_4<='/')||(LA14_4>=':' && LA14_4<='\uFFFF')) ) {s = 28;}

                        else if ( ((LA14_4>='0' && LA14_4<='9')) ) {s = 29;}

                        else s = 11;

                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA14_8 = input.LA(1);

                        s = -1;
                        if ( ((LA14_8>='\u0000' && LA14_8<='\uFFFF')) ) {s = 28;}

                        else s = 11;

                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA14_29 = input.LA(1);

                        s = -1;
                        if ( ((LA14_29>='\u0000' && LA14_29<='-')||LA14_29=='/'||(LA14_29>=':' && LA14_29<='\uFFFF')) ) {s = 28;}

                        else if ( (LA14_29=='.') ) {s = 45;}

                        else if ( ((LA14_29>='0' && LA14_29<='9')) ) {s = 29;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 14, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}