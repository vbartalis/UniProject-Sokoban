/* $$ This file has been instrumented by Clover 4.3.1#20180921211537623 $$ */package model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

/**
 * Class representing a level of the game.
 */
@Data
public class Level {public static class __CLR4_3_11g1gjvpo50ha{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_3_1();if(20180921211537623L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.3.1#20180921211537623,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u007a\u0065\u006e\u006f\u006c\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0073\u007a\u006f\u0066\u0074\u0076\u0065\u0072\u0066\u0065\u006a\u006c\u0065\u0073\u007a\u0074\u0065\u0073\u002f\u0062\u0065\u0061\u0064\u0061\u006e\u0064\u006f\u002f\u0073\u006f\u006b\u006f\u0062\u0061\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1557951569189L,8589935092L,194,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_3_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    /**
     * Name of the level.
     */
    String name;
    /**
     * Width of the level's map.
     */
    int width;
    /**
     * Height of the level's map.
     */
    int height;
    /**
     * List of {@code String} representing the original map of the level.
     *
     */
    List<String> stringMap;
    /**
     * List of {@code Character} lists, representing altered map the level.
     */
    List<List<Character>> charMap;
    /**
     * Position representing the players coordinates on the {@code charMap}.
     */
    Position playerPosition = new Position();
    /**
     * Integer representing the number of steps the Player has made on the level.
     */
    int step;

    private static Logger logger = LoggerFactory.getLogger(Model.class);



    /**
     * Method  for creating a new {@code charMap} from {@code stringMap}.
     *
     */
    public void newCharMap(){try{__CLR4_3_11g1gjvpo50ha.R.inc(52);
        __CLR4_3_11g1gjvpo50ha.R.inc(53);logger.info("making new charmap");
        __CLR4_3_11g1gjvpo50ha.R.inc(54);charMap = new ArrayList<>();
        __CLR4_3_11g1gjvpo50ha.R.inc(55);for (int i = 0; (((i < stringMap.size())&&(__CLR4_3_11g1gjvpo50ha.R.iget(56)!=0|true))||(__CLR4_3_11g1gjvpo50ha.R.iget(57)==0&false)); i++) {{
            __CLR4_3_11g1gjvpo50ha.R.inc(58);List<Character> characters = new ArrayList<>();
            __CLR4_3_11g1gjvpo50ha.R.inc(59);for (int j = 0; (((j < stringMap.get(i).length())&&(__CLR4_3_11g1gjvpo50ha.R.iget(60)!=0|true))||(__CLR4_3_11g1gjvpo50ha.R.iget(61)==0&false)); j++) {{
                __CLR4_3_11g1gjvpo50ha.R.inc(62);characters.add(stringMap.get(i).charAt(j));
            }
            }__CLR4_3_11g1gjvpo50ha.R.inc(63);charMap.add(characters);
        }
    }}finally{__CLR4_3_11g1gjvpo50ha.R.flushNeeded();}}

    /**
     * Method for moving the Player and the Crates on the map. Modifies the
     * {@code playerPosition} and the {@code charMap}.
     * @param i represents how much the player wants to move on the first coordinates.
     * @param j represents how much the player wants to move on the second coordinates.
     */
    public void move(int i, int j) {try{__CLR4_3_11g1gjvpo50ha.R.inc(64);
        __CLR4_3_11g1gjvpo50ha.R.inc(65);logger.info("trjing to move to [{}] [{}]", i, j);
        __CLR4_3_11g1gjvpo50ha.R.inc(66);playerPosition.setPosition(charMap);
        __CLR4_3_11g1gjvpo50ha.R.inc(67);int h = playerPosition.h;
        __CLR4_3_11g1gjvpo50ha.R.inc(68);int w = playerPosition.w;

        __CLR4_3_11g1gjvpo50ha.R.inc(69);if ((((charMap.get(h).get(w) == '@')&&(__CLR4_3_11g1gjvpo50ha.R.iget(70)!=0|true))||(__CLR4_3_11g1gjvpo50ha.R.iget(71)==0&false))){{
            __CLR4_3_11g1gjvpo50ha.R.inc(72);if ((((charMap.get(h+i).get(w+j) == ' ')&&(__CLR4_3_11g1gjvpo50ha.R.iget(73)!=0|true))||(__CLR4_3_11g1gjvpo50ha.R.iget(74)==0&false))){{__CLR4_3_11g1gjvpo50ha.R.inc(75);charMap.get(h).set(w,' '); __CLR4_3_11g1gjvpo50ha.R.inc(76);charMap.get(h+i).set(w+j,'@'); __CLR4_3_11g1gjvpo50ha.R.inc(77);addStep(); __CLR4_3_11g1gjvpo50ha.R.inc(78);logger.info("moved");}
            }else {__CLR4_3_11g1gjvpo50ha.R.inc(79);if ((((charMap.get(h+i).get(w+j) == '.')&&(__CLR4_3_11g1gjvpo50ha.R.iget(80)!=0|true))||(__CLR4_3_11g1gjvpo50ha.R.iget(81)==0&false))){{__CLR4_3_11g1gjvpo50ha.R.inc(82);charMap.get(h).set(w,' '); __CLR4_3_11g1gjvpo50ha.R.inc(83);charMap.get(h+i).set(w+j,'+'); __CLR4_3_11g1gjvpo50ha.R.inc(84);addStep(); __CLR4_3_11g1gjvpo50ha.R.inc(85);logger.info("moved");}
            }else {__CLR4_3_11g1gjvpo50ha.R.inc(86);if ((((charMap.get(h+i).get(w+j) == '$')&&(__CLR4_3_11g1gjvpo50ha.R.iget(87)!=0|true))||(__CLR4_3_11g1gjvpo50ha.R.iget(88)==0&false))){{
                __CLR4_3_11g1gjvpo50ha.R.inc(89);if ((((charMap.get(h+2*i).get(w+2*j) == ' ')&&(__CLR4_3_11g1gjvpo50ha.R.iget(90)!=0|true))||(__CLR4_3_11g1gjvpo50ha.R.iget(91)==0&false))){{__CLR4_3_11g1gjvpo50ha.R.inc(92);charMap.get(h).set(w,' '); __CLR4_3_11g1gjvpo50ha.R.inc(93);charMap.get(h+i).set(w+j,'@'); __CLR4_3_11g1gjvpo50ha.R.inc(94);charMap.get(h+2*i).set(w+2*j,'$'); __CLR4_3_11g1gjvpo50ha.R.inc(95);addStep(); __CLR4_3_11g1gjvpo50ha.R.inc(96);logger.info("moved");}
                }else {__CLR4_3_11g1gjvpo50ha.R.inc(97);if ((((charMap.get(h+2*i).get(w+2*j) == '.')&&(__CLR4_3_11g1gjvpo50ha.R.iget(98)!=0|true))||(__CLR4_3_11g1gjvpo50ha.R.iget(99)==0&false))){{__CLR4_3_11g1gjvpo50ha.R.inc(100);charMap.get(h).set(w,' '); __CLR4_3_11g1gjvpo50ha.R.inc(101);charMap.get(h+i).set(w+j,'@'); __CLR4_3_11g1gjvpo50ha.R.inc(102);charMap.get(h+2*i).set(w+2*j,'*'); __CLR4_3_11g1gjvpo50ha.R.inc(103);addStep(); __CLR4_3_11g1gjvpo50ha.R.inc(104);logger.info("moved");}
            }}}
            }else {__CLR4_3_11g1gjvpo50ha.R.inc(105);if ((((charMap.get(h+i).get(w+j) == '*')&&(__CLR4_3_11g1gjvpo50ha.R.iget(106)!=0|true))||(__CLR4_3_11g1gjvpo50ha.R.iget(107)==0&false))){{
                __CLR4_3_11g1gjvpo50ha.R.inc(108);if ((((charMap.get(h+2*i).get(w+2*j) == ' ')&&(__CLR4_3_11g1gjvpo50ha.R.iget(109)!=0|true))||(__CLR4_3_11g1gjvpo50ha.R.iget(110)==0&false))){{__CLR4_3_11g1gjvpo50ha.R.inc(111);charMap.get(h).set(w,' '); __CLR4_3_11g1gjvpo50ha.R.inc(112);charMap.get(h+i).set(w+j,'+'); __CLR4_3_11g1gjvpo50ha.R.inc(113);charMap.get(h+2*i).set(w+2*j,'$'); __CLR4_3_11g1gjvpo50ha.R.inc(114);addStep(); __CLR4_3_11g1gjvpo50ha.R.inc(115);logger.info("moved");}
                }else {__CLR4_3_11g1gjvpo50ha.R.inc(116);if ((((charMap.get(h+2*i).get(w+2*j) == '.')&&(__CLR4_3_11g1gjvpo50ha.R.iget(117)!=0|true))||(__CLR4_3_11g1gjvpo50ha.R.iget(118)==0&false))){{__CLR4_3_11g1gjvpo50ha.R.inc(119);charMap.get(h).set(w,' '); __CLR4_3_11g1gjvpo50ha.R.inc(120);charMap.get(h+i).set(w+j,'+'); __CLR4_3_11g1gjvpo50ha.R.inc(121);charMap.get(h+2*i).set(w+2*j,'*'); __CLR4_3_11g1gjvpo50ha.R.inc(122);addStep(); __CLR4_3_11g1gjvpo50ha.R.inc(123);logger.info("moved");}
            }}}
        }}}}}
        }else {__CLR4_3_11g1gjvpo50ha.R.inc(124);if ((((charMap.get(h).get(w) == '+')&&(__CLR4_3_11g1gjvpo50ha.R.iget(125)!=0|true))||(__CLR4_3_11g1gjvpo50ha.R.iget(126)==0&false))){{
            __CLR4_3_11g1gjvpo50ha.R.inc(127);if ((((charMap.get(h+i).get(w+j) == ' ')&&(__CLR4_3_11g1gjvpo50ha.R.iget(128)!=0|true))||(__CLR4_3_11g1gjvpo50ha.R.iget(129)==0&false))){{__CLR4_3_11g1gjvpo50ha.R.inc(130);charMap.get(h).set(w,'.'); __CLR4_3_11g1gjvpo50ha.R.inc(131);charMap.get(h+i).set(w+j,'@'); __CLR4_3_11g1gjvpo50ha.R.inc(132);addStep(); __CLR4_3_11g1gjvpo50ha.R.inc(133);logger.info("moved");}
            }else {__CLR4_3_11g1gjvpo50ha.R.inc(134);if ((((charMap.get(h+i).get(w+j) == '.')&&(__CLR4_3_11g1gjvpo50ha.R.iget(135)!=0|true))||(__CLR4_3_11g1gjvpo50ha.R.iget(136)==0&false))){{__CLR4_3_11g1gjvpo50ha.R.inc(137);charMap.get(h).set(w,'.'); __CLR4_3_11g1gjvpo50ha.R.inc(138);charMap.get(h+i).set(w+j,'+'); __CLR4_3_11g1gjvpo50ha.R.inc(139);addStep(); __CLR4_3_11g1gjvpo50ha.R.inc(140);logger.info("moved");}
            }else {__CLR4_3_11g1gjvpo50ha.R.inc(141);if ((((charMap.get(h+i).get(w+j) == '$')&&(__CLR4_3_11g1gjvpo50ha.R.iget(142)!=0|true))||(__CLR4_3_11g1gjvpo50ha.R.iget(143)==0&false))){{
                __CLR4_3_11g1gjvpo50ha.R.inc(144);if ((((charMap.get(h+2*i).get(w+2*j) == ' ')&&(__CLR4_3_11g1gjvpo50ha.R.iget(145)!=0|true))||(__CLR4_3_11g1gjvpo50ha.R.iget(146)==0&false))){{__CLR4_3_11g1gjvpo50ha.R.inc(147);charMap.get(h).set(w,'.'); __CLR4_3_11g1gjvpo50ha.R.inc(148);charMap.get(h+i).set(w+j,'@'); __CLR4_3_11g1gjvpo50ha.R.inc(149);charMap.get(h+2*i).set(w+2*j,'$'); __CLR4_3_11g1gjvpo50ha.R.inc(150);addStep(); __CLR4_3_11g1gjvpo50ha.R.inc(151);logger.info("moved");}
                }else {__CLR4_3_11g1gjvpo50ha.R.inc(152);if ((((charMap.get(h+2*i).get(w+2*j) == '.')&&(__CLR4_3_11g1gjvpo50ha.R.iget(153)!=0|true))||(__CLR4_3_11g1gjvpo50ha.R.iget(154)==0&false))){{__CLR4_3_11g1gjvpo50ha.R.inc(155);charMap.get(h).set(w,'.'); __CLR4_3_11g1gjvpo50ha.R.inc(156);charMap.get(h+i).set(w+j,'@'); __CLR4_3_11g1gjvpo50ha.R.inc(157);charMap.get(h+2*i).set(w+2*j,'*'); __CLR4_3_11g1gjvpo50ha.R.inc(158);addStep(); __CLR4_3_11g1gjvpo50ha.R.inc(159);logger.info("moved");}
            }}}
            }else {__CLR4_3_11g1gjvpo50ha.R.inc(160);if ((((charMap.get(h+i).get(w+j) == '*')&&(__CLR4_3_11g1gjvpo50ha.R.iget(161)!=0|true))||(__CLR4_3_11g1gjvpo50ha.R.iget(162)==0&false))){{
                __CLR4_3_11g1gjvpo50ha.R.inc(163);if ((((charMap.get(h+2*i).get(w+2*j) == ' ')&&(__CLR4_3_11g1gjvpo50ha.R.iget(164)!=0|true))||(__CLR4_3_11g1gjvpo50ha.R.iget(165)==0&false))){{__CLR4_3_11g1gjvpo50ha.R.inc(166);charMap.get(h).set(w,'.'); __CLR4_3_11g1gjvpo50ha.R.inc(167);charMap.get(h+i).set(w+j,'+'); __CLR4_3_11g1gjvpo50ha.R.inc(168);charMap.get(h+2*i).set(w+2*j,'$'); __CLR4_3_11g1gjvpo50ha.R.inc(169);addStep(); __CLR4_3_11g1gjvpo50ha.R.inc(170);logger.info("moved");}
                }else {__CLR4_3_11g1gjvpo50ha.R.inc(171);if ((((charMap.get(h+2*i).get(w+2*j) == '.')&&(__CLR4_3_11g1gjvpo50ha.R.iget(172)!=0|true))||(__CLR4_3_11g1gjvpo50ha.R.iget(173)==0&false))){{__CLR4_3_11g1gjvpo50ha.R.inc(174);charMap.get(h).set(w,'.'); __CLR4_3_11g1gjvpo50ha.R.inc(175);charMap.get(h+i).set(w+j,'+'); __CLR4_3_11g1gjvpo50ha.R.inc(176);charMap.get(h+2*i).set(w+2*j,'*'); __CLR4_3_11g1gjvpo50ha.R.inc(177);addStep(); __CLR4_3_11g1gjvpo50ha.R.inc(178);logger.info("moved");}
            }}}
        }}}}}
    }}}finally{__CLR4_3_11g1gjvpo50ha.R.flushNeeded();}}

    /**
     * Method for checking if a level is over.
     * @return true if no finish blocks are free ({@literal "."}) and the player does not stay on a finish block ({@literal "+"}).
     */
    public boolean isLevelOver(){try{__CLR4_3_11g1gjvpo50ha.R.inc(179);
        __CLR4_3_11g1gjvpo50ha.R.inc(180);boolean isOver = true;
        __CLR4_3_11g1gjvpo50ha.R.inc(181);for (List<Character> list: charMap) {{
            __CLR4_3_11g1gjvpo50ha.R.inc(182);for (Character character: list) {{
                __CLR4_3_11g1gjvpo50ha.R.inc(183);if ((((character.equals('.') || character.equals('+'))&&(__CLR4_3_11g1gjvpo50ha.R.iget(184)!=0|true))||(__CLR4_3_11g1gjvpo50ha.R.iget(185)==0&false))) {__CLR4_3_11g1gjvpo50ha.R.inc(186);isOver = false;
            }}
        }}
        }__CLR4_3_11g1gjvpo50ha.R.inc(187);return isOver;
    }finally{__CLR4_3_11g1gjvpo50ha.R.flushNeeded();}}

    /**
     * Method fpr deleting unnecessary {@code charMap}.
     */
    public void deleteCharMap(){try{__CLR4_3_11g1gjvpo50ha.R.inc(188);
        __CLR4_3_11g1gjvpo50ha.R.inc(189);this.charMap = null;
    }finally{__CLR4_3_11g1gjvpo50ha.R.flushNeeded();}}

    /**
     * Method for adding one to the {@code step}.
     */
    public void addStep(){try{__CLR4_3_11g1gjvpo50ha.R.inc(190);
        __CLR4_3_11g1gjvpo50ha.R.inc(191);step++;
    }finally{__CLR4_3_11g1gjvpo50ha.R.flushNeeded();}}

    /**
     * Method for getting the {@code step} integer as a {@code String}.
     * @return {@code step} as a string.
     */
    public String getStepToString(){try{__CLR4_3_11g1gjvpo50ha.R.inc(192);
        __CLR4_3_11g1gjvpo50ha.R.inc(193);return Integer.toString(step);
    }finally{__CLR4_3_11g1gjvpo50ha.R.flushNeeded();}}

}

