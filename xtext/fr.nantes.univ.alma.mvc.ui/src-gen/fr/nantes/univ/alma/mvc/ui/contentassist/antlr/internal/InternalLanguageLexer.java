package fr.nantes.univ.alma.mvc.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalLanguageLexer extends Lexer {
    public static final int T__40=40;
    public static final int RULE_ID=5;
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
    public static final int RULE_VERSION=6;
    public static final int T__32=32;
    public static final int RULE_STRING=4;
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
    public String getGrammarFileName() { return "../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g"; }

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:11:7: ( '<?xml version=' )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:11:9: '<?xml version='
            {
            match("<?xml version="); 


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
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:12:7: ( ' encoding=' )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:12:9: ' encoding='
            {
            match(" encoding="); 


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
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:13:7: ( ' ?>' )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:13:9: ' ?>'
            {
            match(" ?>"); 


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
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:14:7: ( '<UIApplication>' )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:14:9: '<UIApplication>'
            {
            match("<UIApplication>"); 


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
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:15:7: ( '</UIApplication>' )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:15:9: '</UIApplication>'
            {
            match("</UIApplication>"); 


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
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:16:7: ( '<models>' )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:16:9: '<models>'
            {
            match("<models>"); 


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
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:17:7: ( '<model ref=' )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:17:9: '<model ref='
            {
            match("<model ref="); 


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
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:18:7: ( ' />' )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:18:9: ' />'
            {
            match(" />"); 


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
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:19:7: ( '</models>' )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:19:9: '</models>'
            {
            match("</models>"); 


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
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:20:7: ( '<pages>' )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:20:9: '<pages>'
            {
            match("<pages>"); 


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
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:21:7: ( '<page ref=' )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:21:9: '<page ref='
            {
            match("<page ref="); 


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
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:22:7: ( '</pages>' )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:22:9: '</pages>'
            {
            match("</pages>"); 


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
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:23:7: ( '<view id=' )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:23:9: '<view id='
            {
            match("<view id="); 


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
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:24:7: ( ' >' )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:24:9: ' >'
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
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:25:7: ( '</view>' )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:25:9: '</view>'
            {
            match("</view>"); 


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
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:26:7: ( '<description>' )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:26:9: '<description>'
            {
            match("<description>"); 


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
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:27:7: ( '</description>' )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:27:9: '</description>'
            {
            match("</description>"); 


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
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:28:7: ( '<actions>' )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:28:9: '<actions>'
            {
            match("<actions>"); 


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
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:29:7: ( '</actions>' )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:29:9: '</actions>'
            {
            match("</actions>"); 


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
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:30:7: ( '<model id=' )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:30:9: '<model id='
            {
            match("<model id="); 


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
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:31:7: ( '</model>' )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:31:9: '</model>'
            {
            match("</model>"); 


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
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:32:7: ( '<properties>' )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:32:9: '<properties>'
            {
            match("<properties>"); 


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
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:33:7: ( '</properties>' )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:33:9: '</properties>'
            {
            match("</properties>"); 


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
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:34:7: ( '<ownedElements>' )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:34:9: '<ownedElements>'
            {
            match("<ownedElements>"); 


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
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:35:7: ( '</ownedElements>' )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:35:9: '</ownedElements>'
            {
            match("</ownedElements>"); 


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
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:36:7: ( '<action name=' )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:36:9: '<action name='
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
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:37:7: ( '</action>' )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:37:9: '</action>'
            {
            match("</action>"); 


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
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:38:7: ( '<nextPage ref=' )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:38:9: '<nextPage ref='
            {
            match("<nextPage ref="); 


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
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:39:7: ( '<modelProperty name=' )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:39:9: '<modelProperty name='
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

    // $ANTLR start "RULE_VERSION"
    public final void mRULE_VERSION() throws RecognitionException {
        try {
            int _type = RULE_VERSION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:3298:14: ( '\"' ( '0' .. '9' )+ '.' ( '0' .. '9' )+ '\"' )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:3298:16: '\"' ( '0' .. '9' )+ '.' ( '0' .. '9' )+ '\"'
            {
            match('\"'); 
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:3298:20: ( '0' .. '9' )+
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
            	    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:3298:21: '0' .. '9'
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
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:3298:36: ( '0' .. '9' )+
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
            	    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:3298:37: '0' .. '9'
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
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:3300:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:3300:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:3300:11: ( '^' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='^') ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:3300:11: '^'
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

            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:3300:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='0' && LA4_0<='9')||(LA4_0>='A' && LA4_0<='Z')||LA4_0=='_'||(LA4_0>='a' && LA4_0<='z')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:
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
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:3302:10: ( ( '0' .. '9' )+ )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:3302:12: ( '0' .. '9' )+
            {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:3302:12: ( '0' .. '9' )+
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
            	    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:3302:13: '0' .. '9'
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
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:3304:13: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:3304:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:3304:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
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
                    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:3304:16: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:3304:20: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
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
                    	    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:3304:21: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
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
                    	    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:3304:66: ~ ( ( '\\\\' | '\"' ) )
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
                    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:3304:86: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:3304:91: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
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
                    	    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:3304:92: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
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
                    	    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:3304:137: ~ ( ( '\\\\' | '\\'' ) )
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
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:3306:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:3306:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:3306:24: ( options {greedy=false; } : . )*
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
            	    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:3306:52: .
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
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:3308:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:3308:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:3308:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>='\u0000' && LA10_0<='\t')||(LA10_0>='\u000B' && LA10_0<='\f')||(LA10_0>='\u000E' && LA10_0<='\uFFFF')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:3308:24: ~ ( ( '\\n' | '\\r' ) )
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

            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:3308:40: ( ( '\\r' )? '\\n' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0=='\n'||LA12_0=='\r') ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:3308:41: ( '\\r' )? '\\n'
                    {
                    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:3308:41: ( '\\r' )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0=='\r') ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:3308:41: '\\r'
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
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:3310:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:3310:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:3310:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
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
            	    // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:
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
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:3312:16: ( . )
            // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:3312:18: .
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
        // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1:8: ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | RULE_VERSION | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt14=37;
        alt14 = dfa14.predict(input);
        switch (alt14) {
            case 1 :
                // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1:10: T__12
                {
                mT__12(); 

                }
                break;
            case 2 :
                // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1:16: T__13
                {
                mT__13(); 

                }
                break;
            case 3 :
                // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1:22: T__14
                {
                mT__14(); 

                }
                break;
            case 4 :
                // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1:28: T__15
                {
                mT__15(); 

                }
                break;
            case 5 :
                // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1:34: T__16
                {
                mT__16(); 

                }
                break;
            case 6 :
                // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1:40: T__17
                {
                mT__17(); 

                }
                break;
            case 7 :
                // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1:46: T__18
                {
                mT__18(); 

                }
                break;
            case 8 :
                // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1:52: T__19
                {
                mT__19(); 

                }
                break;
            case 9 :
                // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1:58: T__20
                {
                mT__20(); 

                }
                break;
            case 10 :
                // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1:64: T__21
                {
                mT__21(); 

                }
                break;
            case 11 :
                // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1:70: T__22
                {
                mT__22(); 

                }
                break;
            case 12 :
                // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1:76: T__23
                {
                mT__23(); 

                }
                break;
            case 13 :
                // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1:82: T__24
                {
                mT__24(); 

                }
                break;
            case 14 :
                // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1:88: T__25
                {
                mT__25(); 

                }
                break;
            case 15 :
                // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1:94: T__26
                {
                mT__26(); 

                }
                break;
            case 16 :
                // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1:100: T__27
                {
                mT__27(); 

                }
                break;
            case 17 :
                // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1:106: T__28
                {
                mT__28(); 

                }
                break;
            case 18 :
                // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1:112: T__29
                {
                mT__29(); 

                }
                break;
            case 19 :
                // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1:118: T__30
                {
                mT__30(); 

                }
                break;
            case 20 :
                // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1:124: T__31
                {
                mT__31(); 

                }
                break;
            case 21 :
                // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1:130: T__32
                {
                mT__32(); 

                }
                break;
            case 22 :
                // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1:136: T__33
                {
                mT__33(); 

                }
                break;
            case 23 :
                // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1:142: T__34
                {
                mT__34(); 

                }
                break;
            case 24 :
                // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1:148: T__35
                {
                mT__35(); 

                }
                break;
            case 25 :
                // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1:154: T__36
                {
                mT__36(); 

                }
                break;
            case 26 :
                // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1:160: T__37
                {
                mT__37(); 

                }
                break;
            case 27 :
                // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1:166: T__38
                {
                mT__38(); 

                }
                break;
            case 28 :
                // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1:172: T__39
                {
                mT__39(); 

                }
                break;
            case 29 :
                // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1:178: T__40
                {
                mT__40(); 

                }
                break;
            case 30 :
                // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1:184: RULE_VERSION
                {
                mRULE_VERSION(); 

                }
                break;
            case 31 :
                // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1:197: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 32 :
                // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1:205: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 33 :
                // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1:214: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 34 :
                // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1:226: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 35 :
                // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1:242: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 36 :
                // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1:258: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 37 :
                // ../fr.nantes.univ.alma.mvc.ui/src-gen/fr/nantes/univ/alma/mvc/ui/contentassist/antlr/internal/InternalLanguage.g:1:266: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA14 dfa14 = new DFA14(this);
    static final String DFA14_eotS =
        "\1\uffff\1\12\1\31\2\12\2\uffff\2\12\107\uffff";
    static final String DFA14_eofS =
        "\120\uffff";
    static final String DFA14_minS =
        "\1\0\2\57\1\0\1\101\2\uffff\1\0\1\52\4\uffff\1\125\1\157\1\141\2"+
        "\uffff\1\143\7\uffff\1\0\6\uffff\1\157\1\141\2\uffff\1\143\1\uffff"+
        "\1\144\1\147\1\uffff\1\164\1\0\1\144\2\uffff\1\164\2\145\1\151\1"+
        "\0\1\145\1\151\1\154\1\40\1\157\1\uffff\1\154\1\157\1\40\2\uffff"+
        "\1\156\1\uffff\1\76\1\156\1\uffff\1\151\1\uffff\1\40\2\uffff\1\76"+
        "\6\uffff";
    static final String DFA14_maxS =
        "\1\uffff\1\166\1\145\1\uffff\1\172\2\uffff\1\uffff\1\57\4\uffff"+
        "\1\166\1\157\1\162\2\uffff\1\143\7\uffff\1\uffff\6\uffff\1\157\1"+
        "\162\2\uffff\1\143\1\uffff\1\144\1\147\1\uffff\1\164\1\uffff\1\144"+
        "\2\uffff\1\164\2\145\1\151\1\uffff\1\145\1\151\1\154\1\163\1\157"+
        "\1\uffff\1\154\1\157\1\163\2\uffff\1\156\1\uffff\1\163\1\156\1\uffff"+
        "\1\162\1\uffff\1\163\2\uffff\1\163\6\uffff";
    static final String DFA14_acceptS =
        "\5\uffff\1\37\1\40\2\uffff\1\44\1\45\1\1\1\4\3\uffff\1\15\1\20\1"+
        "\uffff\1\30\1\34\1\2\1\3\1\10\1\16\1\44\1\uffff\1\41\1\37\1\40\1"+
        "\42\1\43\1\5\2\uffff\1\17\1\21\1\uffff\1\31\2\uffff\1\26\3\uffff"+
        "\1\14\1\27\12\uffff\1\36\3\uffff\1\12\1\13\1\uffff\1\36\2\uffff"+
        "\1\6\1\uffff\1\35\1\uffff\1\11\1\25\1\uffff\1\7\1\24\1\22\1\32\1"+
        "\23\1\33";
    static final String DFA14_specialS =
        "\1\4\2\uffff\1\0\3\uffff\1\1\22\uffff\1\3\20\uffff\1\5\7\uffff\1"+
        "\2\34\uffff}>";
    static final String[] DFA14_transitionS = {
            "\11\12\2\11\2\12\1\11\22\12\1\2\1\12\1\3\4\12\1\7\7\12\1\10"+
            "\12\6\2\12\1\1\4\12\32\5\3\12\1\4\1\5\1\12\32\5\uff85\12",
            "\1\15\17\uffff\1\13\25\uffff\1\14\13\uffff\1\22\2\uffff\1\21"+
            "\10\uffff\1\16\1\24\1\23\1\17\5\uffff\1\20",
            "\1\27\16\uffff\1\30\1\26\45\uffff\1\25",
            "\60\33\12\32\uffc6\33",
            "\32\34\4\uffff\1\34\1\uffff\32\34",
            "",
            "",
            "\0\33",
            "\1\36\4\uffff\1\37",
            "",
            "",
            "",
            "",
            "\1\40\13\uffff\1\45\2\uffff\1\44\10\uffff\1\41\1\uffff\1\46"+
            "\1\42\5\uffff\1\43",
            "\1\47",
            "\1\50\20\uffff\1\51",
            "",
            "",
            "\1\52",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\56\33\1\53\1\33\12\32\uffc6\33",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\54",
            "\1\55\20\uffff\1\56",
            "",
            "",
            "\1\57",
            "",
            "\1\60",
            "\1\61",
            "",
            "\1\62",
            "\60\33\12\63\uffc6\33",
            "\1\64",
            "",
            "",
            "\1\65",
            "\1\66",
            "\1\67",
            "\1\70",
            "\42\33\1\71\15\33\12\63\uffc6\33",
            "\1\72",
            "\1\73",
            "\1\74",
            "\1\76\122\uffff\1\75",
            "\1\77",
            "",
            "\1\101",
            "\1\102",
            "\1\104\57\uffff\1\105\42\uffff\1\103",
            "",
            "",
            "\1\106",
            "",
            "\1\110\64\uffff\1\107",
            "\1\111",
            "",
            "\1\113\10\uffff\1\112",
            "",
            "\1\115\122\uffff\1\114",
            "",
            "",
            "\1\117\64\uffff\1\116",
            "",
            "",
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
            return "1:1: Tokens : ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | RULE_VERSION | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA14_3 = input.LA(1);

                        s = -1;
                        if ( ((LA14_3>='0' && LA14_3<='9')) ) {s = 26;}

                        else if ( ((LA14_3>='\u0000' && LA14_3<='/')||(LA14_3>=':' && LA14_3<='\uFFFF')) ) {s = 27;}

                        else s = 10;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA14_7 = input.LA(1);

                        s = -1;
                        if ( ((LA14_7>='\u0000' && LA14_7<='\uFFFF')) ) {s = 27;}

                        else s = 10;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA14_51 = input.LA(1);

                        s = -1;
                        if ( (LA14_51=='\"') ) {s = 57;}

                        else if ( ((LA14_51>='\u0000' && LA14_51<='!')||(LA14_51>='#' && LA14_51<='/')||(LA14_51>=':' && LA14_51<='\uFFFF')) ) {s = 27;}

                        else if ( ((LA14_51>='0' && LA14_51<='9')) ) {s = 51;}

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA14_26 = input.LA(1);

                        s = -1;
                        if ( (LA14_26=='.') ) {s = 43;}

                        else if ( ((LA14_26>='0' && LA14_26<='9')) ) {s = 26;}

                        else if ( ((LA14_26>='\u0000' && LA14_26<='-')||LA14_26=='/'||(LA14_26>=':' && LA14_26<='\uFFFF')) ) {s = 27;}

                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA14_0 = input.LA(1);

                        s = -1;
                        if ( (LA14_0=='<') ) {s = 1;}

                        else if ( (LA14_0==' ') ) {s = 2;}

                        else if ( (LA14_0=='\"') ) {s = 3;}

                        else if ( (LA14_0=='^') ) {s = 4;}

                        else if ( ((LA14_0>='A' && LA14_0<='Z')||LA14_0=='_'||(LA14_0>='a' && LA14_0<='z')) ) {s = 5;}

                        else if ( ((LA14_0>='0' && LA14_0<='9')) ) {s = 6;}

                        else if ( (LA14_0=='\'') ) {s = 7;}

                        else if ( (LA14_0=='/') ) {s = 8;}

                        else if ( ((LA14_0>='\t' && LA14_0<='\n')||LA14_0=='\r') ) {s = 9;}

                        else if ( ((LA14_0>='\u0000' && LA14_0<='\b')||(LA14_0>='\u000B' && LA14_0<='\f')||(LA14_0>='\u000E' && LA14_0<='\u001F')||LA14_0=='!'||(LA14_0>='#' && LA14_0<='&')||(LA14_0>='(' && LA14_0<='.')||(LA14_0>=':' && LA14_0<=';')||(LA14_0>='=' && LA14_0<='@')||(LA14_0>='[' && LA14_0<=']')||LA14_0=='`'||(LA14_0>='{' && LA14_0<='\uFFFF')) ) {s = 10;}

                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA14_43 = input.LA(1);

                        s = -1;
                        if ( ((LA14_43>='\u0000' && LA14_43<='/')||(LA14_43>=':' && LA14_43<='\uFFFF')) ) {s = 27;}

                        else if ( ((LA14_43>='0' && LA14_43<='9')) ) {s = 51;}

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