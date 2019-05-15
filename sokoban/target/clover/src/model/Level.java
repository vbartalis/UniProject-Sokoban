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
public class Level {public static class __CLR4_3_11h31h3jvpn03r1{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_3_1();if(20180921211537623L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.3.1#20180921211537623,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u007a\u0065\u006e\u006f\u006c\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0073\u007a\u006f\u0066\u0074\u0076\u0065\u0072\u0066\u0065\u006a\u006c\u0065\u0073\u007a\u0074\u0065\u0073\u002f\u0062\u0065\u0061\u0064\u0061\u006e\u0064\u006f\u002f\u0073\u006f\u006b\u006f\u0062\u0061\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1557949660591L,8589935092L,2053,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_3_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
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
    public void newCharMap(){try{__CLR4_3_11h31h3jvpn03r1.R.inc(1911);
        __CLR4_3_11h31h3jvpn03r1.R.inc(1912);logger.info("making new charmap");
        __CLR4_3_11h31h3jvpn03r1.R.inc(1913);charMap = new ArrayList<>();
        __CLR4_3_11h31h3jvpn03r1.R.inc(1914);for (int i = 0; (((i < stringMap.size())&&(__CLR4_3_11h31h3jvpn03r1.R.iget(1915)!=0|true))||(__CLR4_3_11h31h3jvpn03r1.R.iget(1916)==0&false)); i++) {{
            __CLR4_3_11h31h3jvpn03r1.R.inc(1917);List<Character> characters = new ArrayList<>();
            __CLR4_3_11h31h3jvpn03r1.R.inc(1918);for (int j = 0; (((j < stringMap.get(i).length())&&(__CLR4_3_11h31h3jvpn03r1.R.iget(1919)!=0|true))||(__CLR4_3_11h31h3jvpn03r1.R.iget(1920)==0&false)); j++) {{
                __CLR4_3_11h31h3jvpn03r1.R.inc(1921);characters.add(stringMap.get(i).charAt(j));
            }
            }__CLR4_3_11h31h3jvpn03r1.R.inc(1922);charMap.add(characters);
        }
    }}finally{__CLR4_3_11h31h3jvpn03r1.R.flushNeeded();}}

    /**
     * Method for moving the Player and the Crates on the map. Modifies the
     * {@code playerPosition} and the {@code charMap}.
     * @param i represents how much the player wants to move on the first coordinates.
     * @param j represents how much the player wants to move on the second coordinates.
     */
    public void move(int i, int j) {try{__CLR4_3_11h31h3jvpn03r1.R.inc(1923);
        __CLR4_3_11h31h3jvpn03r1.R.inc(1924);logger.info("trjing to move to [{}] [{}]", i, j);
        __CLR4_3_11h31h3jvpn03r1.R.inc(1925);playerPosition.setPosition(charMap);
        __CLR4_3_11h31h3jvpn03r1.R.inc(1926);int h = playerPosition.h;
        __CLR4_3_11h31h3jvpn03r1.R.inc(1927);int w = playerPosition.w;

        __CLR4_3_11h31h3jvpn03r1.R.inc(1928);if ((((charMap.get(h).get(w) == '@')&&(__CLR4_3_11h31h3jvpn03r1.R.iget(1929)!=0|true))||(__CLR4_3_11h31h3jvpn03r1.R.iget(1930)==0&false))){{
            __CLR4_3_11h31h3jvpn03r1.R.inc(1931);if ((((charMap.get(h+i).get(w+j) == ' ')&&(__CLR4_3_11h31h3jvpn03r1.R.iget(1932)!=0|true))||(__CLR4_3_11h31h3jvpn03r1.R.iget(1933)==0&false))){{__CLR4_3_11h31h3jvpn03r1.R.inc(1934);charMap.get(h).set(w,' '); __CLR4_3_11h31h3jvpn03r1.R.inc(1935);charMap.get(h+i).set(w+j,'@'); __CLR4_3_11h31h3jvpn03r1.R.inc(1936);addStep(); __CLR4_3_11h31h3jvpn03r1.R.inc(1937);logger.info("moved");}
            }else {__CLR4_3_11h31h3jvpn03r1.R.inc(1938);if ((((charMap.get(h+i).get(w+j) == '.')&&(__CLR4_3_11h31h3jvpn03r1.R.iget(1939)!=0|true))||(__CLR4_3_11h31h3jvpn03r1.R.iget(1940)==0&false))){{__CLR4_3_11h31h3jvpn03r1.R.inc(1941);charMap.get(h).set(w,' '); __CLR4_3_11h31h3jvpn03r1.R.inc(1942);charMap.get(h+i).set(w+j,'+'); __CLR4_3_11h31h3jvpn03r1.R.inc(1943);addStep(); __CLR4_3_11h31h3jvpn03r1.R.inc(1944);logger.info("moved");}
            }else {__CLR4_3_11h31h3jvpn03r1.R.inc(1945);if ((((charMap.get(h+i).get(w+j) == '$')&&(__CLR4_3_11h31h3jvpn03r1.R.iget(1946)!=0|true))||(__CLR4_3_11h31h3jvpn03r1.R.iget(1947)==0&false))){{
                __CLR4_3_11h31h3jvpn03r1.R.inc(1948);if ((((charMap.get(h+2*i).get(w+2*j) == ' ')&&(__CLR4_3_11h31h3jvpn03r1.R.iget(1949)!=0|true))||(__CLR4_3_11h31h3jvpn03r1.R.iget(1950)==0&false))){{__CLR4_3_11h31h3jvpn03r1.R.inc(1951);charMap.get(h).set(w,' '); __CLR4_3_11h31h3jvpn03r1.R.inc(1952);charMap.get(h+i).set(w+j,'@'); __CLR4_3_11h31h3jvpn03r1.R.inc(1953);charMap.get(h+2*i).set(w+2*j,'$'); __CLR4_3_11h31h3jvpn03r1.R.inc(1954);addStep(); __CLR4_3_11h31h3jvpn03r1.R.inc(1955);logger.info("moved");}
                }else {__CLR4_3_11h31h3jvpn03r1.R.inc(1956);if ((((charMap.get(h+2*i).get(w+2*j) == '.')&&(__CLR4_3_11h31h3jvpn03r1.R.iget(1957)!=0|true))||(__CLR4_3_11h31h3jvpn03r1.R.iget(1958)==0&false))){{__CLR4_3_11h31h3jvpn03r1.R.inc(1959);charMap.get(h).set(w,' '); __CLR4_3_11h31h3jvpn03r1.R.inc(1960);charMap.get(h+i).set(w+j,'@'); __CLR4_3_11h31h3jvpn03r1.R.inc(1961);charMap.get(h+2*i).set(w+2*j,'*'); __CLR4_3_11h31h3jvpn03r1.R.inc(1962);addStep(); __CLR4_3_11h31h3jvpn03r1.R.inc(1963);logger.info("moved");}
            }}}
            }else {__CLR4_3_11h31h3jvpn03r1.R.inc(1964);if ((((charMap.get(h+i).get(w+j) == '*')&&(__CLR4_3_11h31h3jvpn03r1.R.iget(1965)!=0|true))||(__CLR4_3_11h31h3jvpn03r1.R.iget(1966)==0&false))){{
                __CLR4_3_11h31h3jvpn03r1.R.inc(1967);if ((((charMap.get(h+2*i).get(w+2*j) == ' ')&&(__CLR4_3_11h31h3jvpn03r1.R.iget(1968)!=0|true))||(__CLR4_3_11h31h3jvpn03r1.R.iget(1969)==0&false))){{__CLR4_3_11h31h3jvpn03r1.R.inc(1970);charMap.get(h).set(w,' '); __CLR4_3_11h31h3jvpn03r1.R.inc(1971);charMap.get(h+i).set(w+j,'+'); __CLR4_3_11h31h3jvpn03r1.R.inc(1972);charMap.get(h+2*i).set(w+2*j,'$'); __CLR4_3_11h31h3jvpn03r1.R.inc(1973);addStep(); __CLR4_3_11h31h3jvpn03r1.R.inc(1974);logger.info("moved");}
                }else {__CLR4_3_11h31h3jvpn03r1.R.inc(1975);if ((((charMap.get(h+2*i).get(w+2*j) == '.')&&(__CLR4_3_11h31h3jvpn03r1.R.iget(1976)!=0|true))||(__CLR4_3_11h31h3jvpn03r1.R.iget(1977)==0&false))){{__CLR4_3_11h31h3jvpn03r1.R.inc(1978);charMap.get(h).set(w,' '); __CLR4_3_11h31h3jvpn03r1.R.inc(1979);charMap.get(h+i).set(w+j,'+'); __CLR4_3_11h31h3jvpn03r1.R.inc(1980);charMap.get(h+2*i).set(w+2*j,'*'); __CLR4_3_11h31h3jvpn03r1.R.inc(1981);addStep(); __CLR4_3_11h31h3jvpn03r1.R.inc(1982);logger.info("moved");}
            }}}
        }}}}}
        }else {__CLR4_3_11h31h3jvpn03r1.R.inc(1983);if ((((charMap.get(h).get(w) == '+')&&(__CLR4_3_11h31h3jvpn03r1.R.iget(1984)!=0|true))||(__CLR4_3_11h31h3jvpn03r1.R.iget(1985)==0&false))){{
            __CLR4_3_11h31h3jvpn03r1.R.inc(1986);if ((((charMap.get(h+i).get(w+j) == ' ')&&(__CLR4_3_11h31h3jvpn03r1.R.iget(1987)!=0|true))||(__CLR4_3_11h31h3jvpn03r1.R.iget(1988)==0&false))){{__CLR4_3_11h31h3jvpn03r1.R.inc(1989);charMap.get(h).set(w,'.'); __CLR4_3_11h31h3jvpn03r1.R.inc(1990);charMap.get(h+i).set(w+j,'@'); __CLR4_3_11h31h3jvpn03r1.R.inc(1991);addStep(); __CLR4_3_11h31h3jvpn03r1.R.inc(1992);logger.info("moved");}
            }else {__CLR4_3_11h31h3jvpn03r1.R.inc(1993);if ((((charMap.get(h+i).get(w+j) == '.')&&(__CLR4_3_11h31h3jvpn03r1.R.iget(1994)!=0|true))||(__CLR4_3_11h31h3jvpn03r1.R.iget(1995)==0&false))){{__CLR4_3_11h31h3jvpn03r1.R.inc(1996);charMap.get(h).set(w,'.'); __CLR4_3_11h31h3jvpn03r1.R.inc(1997);charMap.get(h+i).set(w+j,'+'); __CLR4_3_11h31h3jvpn03r1.R.inc(1998);addStep(); __CLR4_3_11h31h3jvpn03r1.R.inc(1999);logger.info("moved");}
            }else {__CLR4_3_11h31h3jvpn03r1.R.inc(2000);if ((((charMap.get(h+i).get(w+j) == '$')&&(__CLR4_3_11h31h3jvpn03r1.R.iget(2001)!=0|true))||(__CLR4_3_11h31h3jvpn03r1.R.iget(2002)==0&false))){{
                __CLR4_3_11h31h3jvpn03r1.R.inc(2003);if ((((charMap.get(h+2*i).get(w+2*j) == ' ')&&(__CLR4_3_11h31h3jvpn03r1.R.iget(2004)!=0|true))||(__CLR4_3_11h31h3jvpn03r1.R.iget(2005)==0&false))){{__CLR4_3_11h31h3jvpn03r1.R.inc(2006);charMap.get(h).set(w,'.'); __CLR4_3_11h31h3jvpn03r1.R.inc(2007);charMap.get(h+i).set(w+j,'@'); __CLR4_3_11h31h3jvpn03r1.R.inc(2008);charMap.get(h+2*i).set(w+2*j,'$'); __CLR4_3_11h31h3jvpn03r1.R.inc(2009);addStep(); __CLR4_3_11h31h3jvpn03r1.R.inc(2010);logger.info("moved");}
                }else {__CLR4_3_11h31h3jvpn03r1.R.inc(2011);if ((((charMap.get(h+2*i).get(w+2*j) == '.')&&(__CLR4_3_11h31h3jvpn03r1.R.iget(2012)!=0|true))||(__CLR4_3_11h31h3jvpn03r1.R.iget(2013)==0&false))){{__CLR4_3_11h31h3jvpn03r1.R.inc(2014);charMap.get(h).set(w,'.'); __CLR4_3_11h31h3jvpn03r1.R.inc(2015);charMap.get(h+i).set(w+j,'@'); __CLR4_3_11h31h3jvpn03r1.R.inc(2016);charMap.get(h+2*i).set(w+2*j,'*'); __CLR4_3_11h31h3jvpn03r1.R.inc(2017);addStep(); __CLR4_3_11h31h3jvpn03r1.R.inc(2018);logger.info("moved");}
            }}}
            }else {__CLR4_3_11h31h3jvpn03r1.R.inc(2019);if ((((charMap.get(h+i).get(w+j) == '*')&&(__CLR4_3_11h31h3jvpn03r1.R.iget(2020)!=0|true))||(__CLR4_3_11h31h3jvpn03r1.R.iget(2021)==0&false))){{
                __CLR4_3_11h31h3jvpn03r1.R.inc(2022);if ((((charMap.get(h+2*i).get(w+2*j) == ' ')&&(__CLR4_3_11h31h3jvpn03r1.R.iget(2023)!=0|true))||(__CLR4_3_11h31h3jvpn03r1.R.iget(2024)==0&false))){{__CLR4_3_11h31h3jvpn03r1.R.inc(2025);charMap.get(h).set(w,'.'); __CLR4_3_11h31h3jvpn03r1.R.inc(2026);charMap.get(h+i).set(w+j,'+'); __CLR4_3_11h31h3jvpn03r1.R.inc(2027);charMap.get(h+2*i).set(w+2*j,'$'); __CLR4_3_11h31h3jvpn03r1.R.inc(2028);addStep(); __CLR4_3_11h31h3jvpn03r1.R.inc(2029);logger.info("moved");}
                }else {__CLR4_3_11h31h3jvpn03r1.R.inc(2030);if ((((charMap.get(h+2*i).get(w+2*j) == '.')&&(__CLR4_3_11h31h3jvpn03r1.R.iget(2031)!=0|true))||(__CLR4_3_11h31h3jvpn03r1.R.iget(2032)==0&false))){{__CLR4_3_11h31h3jvpn03r1.R.inc(2033);charMap.get(h).set(w,'.'); __CLR4_3_11h31h3jvpn03r1.R.inc(2034);charMap.get(h+i).set(w+j,'+'); __CLR4_3_11h31h3jvpn03r1.R.inc(2035);charMap.get(h+2*i).set(w+2*j,'*'); __CLR4_3_11h31h3jvpn03r1.R.inc(2036);addStep(); __CLR4_3_11h31h3jvpn03r1.R.inc(2037);logger.info("moved");}
            }}}
        }}}}}
    }}}finally{__CLR4_3_11h31h3jvpn03r1.R.flushNeeded();}}

    /**
     * Method for checking if a level is over.
     * @return true if no finish blocks are free ({@literal "."}) and the player does not stay on a finish block ({@literal "+"}).
     */
    public boolean isLevelOver(){try{__CLR4_3_11h31h3jvpn03r1.R.inc(2038);
        __CLR4_3_11h31h3jvpn03r1.R.inc(2039);boolean isOver = true;
        __CLR4_3_11h31h3jvpn03r1.R.inc(2040);for (List<Character> list: charMap) {{
            __CLR4_3_11h31h3jvpn03r1.R.inc(2041);for (Character character: list) {{
                __CLR4_3_11h31h3jvpn03r1.R.inc(2042);if ((((character.equals('.') || character.equals('+'))&&(__CLR4_3_11h31h3jvpn03r1.R.iget(2043)!=0|true))||(__CLR4_3_11h31h3jvpn03r1.R.iget(2044)==0&false))) {__CLR4_3_11h31h3jvpn03r1.R.inc(2045);isOver = false;
            }}
        }}
        }__CLR4_3_11h31h3jvpn03r1.R.inc(2046);return isOver;
    }finally{__CLR4_3_11h31h3jvpn03r1.R.flushNeeded();}}

    /**
     * Method fpr deleting unnecessary {@code charMap}.
     */
    public void deleteCharMap(){try{__CLR4_3_11h31h3jvpn03r1.R.inc(2047);
        __CLR4_3_11h31h3jvpn03r1.R.inc(2048);this.charMap = null;
    }finally{__CLR4_3_11h31h3jvpn03r1.R.flushNeeded();}}

    /**
     * Method for adding one to the {@code step}.
     */
    public void addStep(){try{__CLR4_3_11h31h3jvpn03r1.R.inc(2049);
        __CLR4_3_11h31h3jvpn03r1.R.inc(2050);step++;
    }finally{__CLR4_3_11h31h3jvpn03r1.R.flushNeeded();}}

    /**
     * Method for getting the {@code step} integer as a {@code String}.
     * @return {@code step} as a string.
     */
    public String getStepToString(){try{__CLR4_3_11h31h3jvpn03r1.R.inc(2051);
        __CLR4_3_11h31h3jvpn03r1.R.inc(2052);return Integer.toString(step);
    }finally{__CLR4_3_11h31h3jvpn03r1.R.flushNeeded();}}

}

