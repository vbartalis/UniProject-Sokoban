/* $$ This file has been instrumented by Clover 4.3.1#20180921211537623 $$ */package model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

@Data
public class Level {public static class __CLR4_3_11g1gjvp8kaw8{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_3_1();if(20180921211537623L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.3.1#20180921211537623,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u007a\u0065\u006e\u006f\u006c\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0073\u007a\u006f\u0066\u0074\u0076\u0065\u0072\u0066\u0065\u006a\u006c\u0065\u0073\u007a\u0074\u0065\u0073\u002f\u0062\u0065\u0061\u0064\u0061\u006e\u0064\u006f\u002f\u0073\u006f\u006b\u006f\u0062\u0061\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1557925408667L,8589935092L,195,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_3_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    String name;
    int width;
    int height;
    List<String> stringMap;
    List<List<Character>> charMap;
    Position playerPosition;
    int step;

    private static Logger logger = LoggerFactory.getLogger(Model.class);



    public void newCharMap(){try{__CLR4_3_11g1gjvp8kaw8.R.inc(52);
        __CLR4_3_11g1gjvp8kaw8.R.inc(53);logger.info("making new charmap");
        __CLR4_3_11g1gjvp8kaw8.R.inc(54);charMap = new ArrayList<>();
        __CLR4_3_11g1gjvp8kaw8.R.inc(55);for (int i = 0; (((i < stringMap.size())&&(__CLR4_3_11g1gjvp8kaw8.R.iget(56)!=0|true))||(__CLR4_3_11g1gjvp8kaw8.R.iget(57)==0&false)); i++) {{
            __CLR4_3_11g1gjvp8kaw8.R.inc(58);List<Character> characters = new ArrayList<>();
            __CLR4_3_11g1gjvp8kaw8.R.inc(59);for (int j = 0; (((j < stringMap.get(i).length())&&(__CLR4_3_11g1gjvp8kaw8.R.iget(60)!=0|true))||(__CLR4_3_11g1gjvp8kaw8.R.iget(61)==0&false)); j++) {{
                __CLR4_3_11g1gjvp8kaw8.R.inc(62);characters.add(stringMap.get(i).charAt(j));
            }
            }__CLR4_3_11g1gjvp8kaw8.R.inc(63);charMap.add(characters);
        }
        }__CLR4_3_11g1gjvp8kaw8.R.inc(64);playerPosition = new Position();
    }finally{__CLR4_3_11g1gjvp8kaw8.R.flushNeeded();}}

    public void move(int x, int y) {try{__CLR4_3_11g1gjvp8kaw8.R.inc(65);
        __CLR4_3_11g1gjvp8kaw8.R.inc(66);logger.info("trying to move to [{}] [{}]", x, y);
        __CLR4_3_11g1gjvp8kaw8.R.inc(67);playerPosition.setPosition(charMap);
        __CLR4_3_11g1gjvp8kaw8.R.inc(68);int h = playerPosition.h;
        __CLR4_3_11g1gjvp8kaw8.R.inc(69);int w = playerPosition.w;

        __CLR4_3_11g1gjvp8kaw8.R.inc(70);if ((((charMap.get(h).get(w) == '@')&&(__CLR4_3_11g1gjvp8kaw8.R.iget(71)!=0|true))||(__CLR4_3_11g1gjvp8kaw8.R.iget(72)==0&false))){{
            __CLR4_3_11g1gjvp8kaw8.R.inc(73);if ((((charMap.get(h+x).get(w+y) == ' ')&&(__CLR4_3_11g1gjvp8kaw8.R.iget(74)!=0|true))||(__CLR4_3_11g1gjvp8kaw8.R.iget(75)==0&false))){{__CLR4_3_11g1gjvp8kaw8.R.inc(76);charMap.get(h).set(w,' '); __CLR4_3_11g1gjvp8kaw8.R.inc(77);charMap.get(h+x).set(w+y,'@'); __CLR4_3_11g1gjvp8kaw8.R.inc(78);addStep(); __CLR4_3_11g1gjvp8kaw8.R.inc(79);logger.info("moved");}
            }else {__CLR4_3_11g1gjvp8kaw8.R.inc(80);if ((((charMap.get(h+x).get(w+y) == '.')&&(__CLR4_3_11g1gjvp8kaw8.R.iget(81)!=0|true))||(__CLR4_3_11g1gjvp8kaw8.R.iget(82)==0&false))){{__CLR4_3_11g1gjvp8kaw8.R.inc(83);charMap.get(h).set(w,' '); __CLR4_3_11g1gjvp8kaw8.R.inc(84);charMap.get(h+x).set(w+y,'+'); __CLR4_3_11g1gjvp8kaw8.R.inc(85);addStep(); __CLR4_3_11g1gjvp8kaw8.R.inc(86);logger.info("moved");}
            }else {__CLR4_3_11g1gjvp8kaw8.R.inc(87);if ((((charMap.get(h+x).get(w+y) == '$')&&(__CLR4_3_11g1gjvp8kaw8.R.iget(88)!=0|true))||(__CLR4_3_11g1gjvp8kaw8.R.iget(89)==0&false))){{
                __CLR4_3_11g1gjvp8kaw8.R.inc(90);if ((((charMap.get(h+2*x).get(w+2*y) == ' ')&&(__CLR4_3_11g1gjvp8kaw8.R.iget(91)!=0|true))||(__CLR4_3_11g1gjvp8kaw8.R.iget(92)==0&false))){{__CLR4_3_11g1gjvp8kaw8.R.inc(93);charMap.get(h).set(w,' '); __CLR4_3_11g1gjvp8kaw8.R.inc(94);charMap.get(h+x).set(w+y,'@'); __CLR4_3_11g1gjvp8kaw8.R.inc(95);charMap.get(h+2*x).set(w+2*y,'$'); __CLR4_3_11g1gjvp8kaw8.R.inc(96);addStep(); __CLR4_3_11g1gjvp8kaw8.R.inc(97);logger.info("moved");}
                }else {__CLR4_3_11g1gjvp8kaw8.R.inc(98);if ((((charMap.get(h+2*x).get(w+2*y) == '.')&&(__CLR4_3_11g1gjvp8kaw8.R.iget(99)!=0|true))||(__CLR4_3_11g1gjvp8kaw8.R.iget(100)==0&false))){{__CLR4_3_11g1gjvp8kaw8.R.inc(101);charMap.get(h).set(w,' '); __CLR4_3_11g1gjvp8kaw8.R.inc(102);charMap.get(h+x).set(w+y,'@'); __CLR4_3_11g1gjvp8kaw8.R.inc(103);charMap.get(h+2*x).set(w+2*y,'*'); __CLR4_3_11g1gjvp8kaw8.R.inc(104);addStep(); __CLR4_3_11g1gjvp8kaw8.R.inc(105);logger.info("moved");}
            }}}
            }else {__CLR4_3_11g1gjvp8kaw8.R.inc(106);if ((((charMap.get(h+x).get(w+y) == '*')&&(__CLR4_3_11g1gjvp8kaw8.R.iget(107)!=0|true))||(__CLR4_3_11g1gjvp8kaw8.R.iget(108)==0&false))){{
                __CLR4_3_11g1gjvp8kaw8.R.inc(109);if ((((charMap.get(h+2*x).get(w+2*y) == ' ')&&(__CLR4_3_11g1gjvp8kaw8.R.iget(110)!=0|true))||(__CLR4_3_11g1gjvp8kaw8.R.iget(111)==0&false))){{__CLR4_3_11g1gjvp8kaw8.R.inc(112);charMap.get(h).set(w,' '); __CLR4_3_11g1gjvp8kaw8.R.inc(113);charMap.get(h+x).set(w+y,'+'); __CLR4_3_11g1gjvp8kaw8.R.inc(114);charMap.get(h+2*x).set(w+2*y,'$'); __CLR4_3_11g1gjvp8kaw8.R.inc(115);addStep(); __CLR4_3_11g1gjvp8kaw8.R.inc(116);logger.info("moved");}
                }else {__CLR4_3_11g1gjvp8kaw8.R.inc(117);if ((((charMap.get(h+2*x).get(w+2*y) == '.')&&(__CLR4_3_11g1gjvp8kaw8.R.iget(118)!=0|true))||(__CLR4_3_11g1gjvp8kaw8.R.iget(119)==0&false))){{__CLR4_3_11g1gjvp8kaw8.R.inc(120);charMap.get(h).set(w,' '); __CLR4_3_11g1gjvp8kaw8.R.inc(121);charMap.get(h+x).set(w+y,'+'); __CLR4_3_11g1gjvp8kaw8.R.inc(122);charMap.get(h+2*x).set(w+2*y,'*'); __CLR4_3_11g1gjvp8kaw8.R.inc(123);addStep(); __CLR4_3_11g1gjvp8kaw8.R.inc(124);logger.info("moved");}
            }}}
        }}}}}
        }else {__CLR4_3_11g1gjvp8kaw8.R.inc(125);if ((((charMap.get(h).get(w) == '+')&&(__CLR4_3_11g1gjvp8kaw8.R.iget(126)!=0|true))||(__CLR4_3_11g1gjvp8kaw8.R.iget(127)==0&false))){{
            __CLR4_3_11g1gjvp8kaw8.R.inc(128);if ((((charMap.get(h+x).get(w+y) == ' ')&&(__CLR4_3_11g1gjvp8kaw8.R.iget(129)!=0|true))||(__CLR4_3_11g1gjvp8kaw8.R.iget(130)==0&false))){{__CLR4_3_11g1gjvp8kaw8.R.inc(131);charMap.get(h).set(w,'.'); __CLR4_3_11g1gjvp8kaw8.R.inc(132);charMap.get(h+x).set(w+y,'@'); __CLR4_3_11g1gjvp8kaw8.R.inc(133);addStep(); __CLR4_3_11g1gjvp8kaw8.R.inc(134);logger.info("moved");}
            }else {__CLR4_3_11g1gjvp8kaw8.R.inc(135);if ((((charMap.get(h+x).get(w+y) == '.')&&(__CLR4_3_11g1gjvp8kaw8.R.iget(136)!=0|true))||(__CLR4_3_11g1gjvp8kaw8.R.iget(137)==0&false))){{__CLR4_3_11g1gjvp8kaw8.R.inc(138);charMap.get(h).set(w,'.'); __CLR4_3_11g1gjvp8kaw8.R.inc(139);charMap.get(h+x).set(w+y,'+'); __CLR4_3_11g1gjvp8kaw8.R.inc(140);addStep(); __CLR4_3_11g1gjvp8kaw8.R.inc(141);logger.info("moved");}
            }else {__CLR4_3_11g1gjvp8kaw8.R.inc(142);if ((((charMap.get(h+x).get(w+y) == '$')&&(__CLR4_3_11g1gjvp8kaw8.R.iget(143)!=0|true))||(__CLR4_3_11g1gjvp8kaw8.R.iget(144)==0&false))){{
                __CLR4_3_11g1gjvp8kaw8.R.inc(145);if ((((charMap.get(h+2*x).get(w+2*y) == ' ')&&(__CLR4_3_11g1gjvp8kaw8.R.iget(146)!=0|true))||(__CLR4_3_11g1gjvp8kaw8.R.iget(147)==0&false))){{__CLR4_3_11g1gjvp8kaw8.R.inc(148);charMap.get(h).set(w,'.'); __CLR4_3_11g1gjvp8kaw8.R.inc(149);charMap.get(h+x).set(w+y,'@'); __CLR4_3_11g1gjvp8kaw8.R.inc(150);charMap.get(h+2*x).set(w+2*y,'$'); __CLR4_3_11g1gjvp8kaw8.R.inc(151);addStep(); __CLR4_3_11g1gjvp8kaw8.R.inc(152);logger.info("moved");}
                }else {__CLR4_3_11g1gjvp8kaw8.R.inc(153);if ((((charMap.get(h+2*x).get(w+2*y) == '.')&&(__CLR4_3_11g1gjvp8kaw8.R.iget(154)!=0|true))||(__CLR4_3_11g1gjvp8kaw8.R.iget(155)==0&false))){{__CLR4_3_11g1gjvp8kaw8.R.inc(156);charMap.get(h).set(w,'.'); __CLR4_3_11g1gjvp8kaw8.R.inc(157);charMap.get(h+x).set(w+y,'@'); __CLR4_3_11g1gjvp8kaw8.R.inc(158);charMap.get(h+2*x).set(w+2*y,'*'); __CLR4_3_11g1gjvp8kaw8.R.inc(159);addStep(); __CLR4_3_11g1gjvp8kaw8.R.inc(160);logger.info("moved");}
            }}}
            }else {__CLR4_3_11g1gjvp8kaw8.R.inc(161);if ((((charMap.get(h+x).get(w+y) == '*')&&(__CLR4_3_11g1gjvp8kaw8.R.iget(162)!=0|true))||(__CLR4_3_11g1gjvp8kaw8.R.iget(163)==0&false))){{
                __CLR4_3_11g1gjvp8kaw8.R.inc(164);if ((((charMap.get(h+2*x).get(w+2*y) == ' ')&&(__CLR4_3_11g1gjvp8kaw8.R.iget(165)!=0|true))||(__CLR4_3_11g1gjvp8kaw8.R.iget(166)==0&false))){{__CLR4_3_11g1gjvp8kaw8.R.inc(167);charMap.get(h).set(w,'.'); __CLR4_3_11g1gjvp8kaw8.R.inc(168);charMap.get(h+x).set(w+y,'+'); __CLR4_3_11g1gjvp8kaw8.R.inc(169);charMap.get(h+2*x).set(w+2*y,'$'); __CLR4_3_11g1gjvp8kaw8.R.inc(170);addStep(); __CLR4_3_11g1gjvp8kaw8.R.inc(171);logger.info("moved");}
                }else {__CLR4_3_11g1gjvp8kaw8.R.inc(172);if ((((charMap.get(h+2*x).get(w+2*y) == '.')&&(__CLR4_3_11g1gjvp8kaw8.R.iget(173)!=0|true))||(__CLR4_3_11g1gjvp8kaw8.R.iget(174)==0&false))){{__CLR4_3_11g1gjvp8kaw8.R.inc(175);charMap.get(h).set(w,'.'); __CLR4_3_11g1gjvp8kaw8.R.inc(176);charMap.get(h+x).set(w+y,'+'); __CLR4_3_11g1gjvp8kaw8.R.inc(177);charMap.get(h+2*x).set(w+2*y,'*'); __CLR4_3_11g1gjvp8kaw8.R.inc(178);addStep(); __CLR4_3_11g1gjvp8kaw8.R.inc(179);logger.info("moved");}
            }}}
        }}}}}
    }}}finally{__CLR4_3_11g1gjvp8kaw8.R.flushNeeded();}}

    public boolean isLevelOver(){try{__CLR4_3_11g1gjvp8kaw8.R.inc(180);
        __CLR4_3_11g1gjvp8kaw8.R.inc(181);boolean isOver = true;
        __CLR4_3_11g1gjvp8kaw8.R.inc(182);for (List<Character> list: charMap) {{
            __CLR4_3_11g1gjvp8kaw8.R.inc(183);for (Character character: list) {{
                __CLR4_3_11g1gjvp8kaw8.R.inc(184);if ((((character.equals('.') || character.equals('+'))&&(__CLR4_3_11g1gjvp8kaw8.R.iget(185)!=0|true))||(__CLR4_3_11g1gjvp8kaw8.R.iget(186)==0&false))) {__CLR4_3_11g1gjvp8kaw8.R.inc(187);isOver = false;
            }}
        }}
        }__CLR4_3_11g1gjvp8kaw8.R.inc(188);return isOver;
    }finally{__CLR4_3_11g1gjvp8kaw8.R.flushNeeded();}}

    public void deletCharMap(){try{__CLR4_3_11g1gjvp8kaw8.R.inc(189);
        __CLR4_3_11g1gjvp8kaw8.R.inc(190);this.charMap = null;
    }finally{__CLR4_3_11g1gjvp8kaw8.R.flushNeeded();}}

    public void addStep(){try{__CLR4_3_11g1gjvp8kaw8.R.inc(191);
        __CLR4_3_11g1gjvp8kaw8.R.inc(192);step++;
    }finally{__CLR4_3_11g1gjvp8kaw8.R.flushNeeded();}}

    public String getStepToString(){try{__CLR4_3_11g1gjvp8kaw8.R.inc(193);
        __CLR4_3_11g1gjvp8kaw8.R.inc(194);return Integer.toString(step);
    }finally{__CLR4_3_11g1gjvp8kaw8.R.flushNeeded();}}

}

