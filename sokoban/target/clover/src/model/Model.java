/* $$ This file has been instrumented by Clover 4.3.1#20180921211537623 $$ */package model;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import javafx.scene.layout.Pane;
import lombok.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.awt.*;
import java.io.*;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

@Data
public class Model {public static class __CLR4_3_11bj1bjjvpn03sp{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_3_1();if(20180921211537623L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.3.1#20180921211537623,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u007a\u0065\u006e\u006f\u006c\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0073\u007a\u006f\u0066\u0074\u0076\u0065\u0072\u0066\u0065\u006a\u006c\u0065\u0073\u007a\u0074\u0065\u0073\u002f\u0062\u0065\u0061\u0064\u0061\u006e\u0064\u006f\u002f\u0073\u006f\u006b\u006f\u0062\u0061\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1557949660591L,8589935092L,1818,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_3_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    /**
     * list of levels that can be played.
     */
    List<Level> levels;
    /**
     * list of saves that contain the record of each level.
     */
    List<Save> saves;
    /**
     * the number of the current level
     */
    int levelNumber;
    private static Logger logger = LoggerFactory.getLogger(Model.class);

    public Model() {try{__CLR4_3_11bj1bjjvpn03sp.R.inc(1711);
        __CLR4_3_11bj1bjjvpn03sp.R.inc(1712);logger.info("constructing Model");
        __CLR4_3_11bj1bjjvpn03sp.R.inc(1713);this.levelNumber = 0;
        __CLR4_3_11bj1bjjvpn03sp.R.inc(1714);this.levels = levelFileReader();
        __CLR4_3_11bj1bjjvpn03sp.R.inc(1715);this.saves = saveFileReader();
        __CLR4_3_11bj1bjjvpn03sp.R.inc(1716);levels.get(levelNumber).newCharMap();
    }finally{__CLR4_3_11bj1bjjvpn03sp.R.flushNeeded();}}

    /**
     * Method reads in a list of Levels from a json file.
     * @return a list of Levels
     */
    public List<Level> levelFileReader(){try{__CLR4_3_11bj1bjjvpn03sp.R.inc(1717);
        __CLR4_3_11bj1bjjvpn03sp.R.inc(1718);logger.info("reading level file");
        __CLR4_3_11bj1bjjvpn03sp.R.inc(1719);Gson gson = new GsonBuilder().create();
        __CLR4_3_11bj1bjjvpn03sp.R.inc(1720);Reader reader = new InputStreamReader(getClass().getResourceAsStream("/json/levels.json"));
        __CLR4_3_11bj1bjjvpn03sp.R.inc(1721);Type type = new TypeToken<List<Level>>(){}.getType();
        __CLR4_3_11bj1bjjvpn03sp.R.inc(1722);List<Level>levels = gson.fromJson(reader, type);
        __CLR4_3_11bj1bjjvpn03sp.R.inc(1723);return levels;

    }finally{__CLR4_3_11bj1bjjvpn03sp.R.flushNeeded();}}

    /**
     * Method reads in a list of Saves from a json file, if no save file is found
     * it creates a new list.
     * @return list of Saves from a json file, if no save file is found
     * it creates a new list and returns it.
     */
    public List<Save> saveFileReader(){try{__CLR4_3_11bj1bjjvpn03sp.R.inc(1724);
        __CLR4_3_11bj1bjjvpn03sp.R.inc(1725);logger.info("trying to read save file");
        __CLR4_3_11bj1bjjvpn03sp.R.inc(1726);List<Save> saves = new ArrayList<>();
        __CLR4_3_11bj1bjjvpn03sp.R.inc(1727);try {
            __CLR4_3_11bj1bjjvpn03sp.R.inc(1728);Gson gson = new GsonBuilder().create();
            __CLR4_3_11bj1bjjvpn03sp.R.inc(1729);Reader reader = null;
            __CLR4_3_11bj1bjjvpn03sp.R.inc(1730);reader = new FileReader("~/sokoban/save.json");
            __CLR4_3_11bj1bjjvpn03sp.R.inc(1731);Type type = new TypeToken<List<Save>>(){}.getType();
            __CLR4_3_11bj1bjjvpn03sp.R.inc(1732);saves = gson.fromJson(reader, type);
            __CLR4_3_11bj1bjjvpn03sp.R.inc(1733);logger.info("save file successfully red");
        } catch (FileNotFoundException e) {
            __CLR4_3_11bj1bjjvpn03sp.R.inc(1734);logger.info("no save file found, creating new save");
            __CLR4_3_11bj1bjjvpn03sp.R.inc(1735);Save newSave = new Save(levelNumber);
            __CLR4_3_11bj1bjjvpn03sp.R.inc(1736);saves.add(newSave);
        }
        __CLR4_3_11bj1bjjvpn03sp.R.inc(1737);return saves;
    }finally{__CLR4_3_11bj1bjjvpn03sp.R.flushNeeded();}}

    /**
     * Method try's to overwrite a list of saves into a file. If the file
     * does not exist it creates it.
     */
    public void saveFileWriter(){try{__CLR4_3_11bj1bjjvpn03sp.R.inc(1738);
        __CLR4_3_11bj1bjjvpn03sp.R.inc(1739);logger.info("trying to save");
        __CLR4_3_11bj1bjjvpn03sp.R.inc(1740);try {
            __CLR4_3_11bj1bjjvpn03sp.R.inc(1741);File file = new File("~/sokoban/save.json");
            __CLR4_3_11bj1bjjvpn03sp.R.inc(1742);File parent = file.getParentFile();
            __CLR4_3_11bj1bjjvpn03sp.R.inc(1743);if ((((!parent.exists() && !parent.mkdirs())&&(__CLR4_3_11bj1bjjvpn03sp.R.iget(1744)!=0|true))||(__CLR4_3_11bj1bjjvpn03sp.R.iget(1745)==0&false))) {{
                __CLR4_3_11bj1bjjvpn03sp.R.inc(1746);throw new IllegalStateException("Couldn't create dir: " + parent);
            }
            }__CLR4_3_11bj1bjjvpn03sp.R.inc(1747);file.createNewFile();
            __CLR4_3_11bj1bjjvpn03sp.R.inc(1748);Gson gson = new GsonBuilder().setPrettyPrinting().create();
            __CLR4_3_11bj1bjjvpn03sp.R.inc(1749);Writer writer = new FileWriter(file);

            __CLR4_3_11bj1bjjvpn03sp.R.inc(1750);Type type = new TypeToken<List<Save>>() {
            }.getType();
            __CLR4_3_11bj1bjjvpn03sp.R.inc(1751);String json = gson.toJson(saves, type);

            __CLR4_3_11bj1bjjvpn03sp.R.inc(1752);writer.write(json);
            __CLR4_3_11bj1bjjvpn03sp.R.inc(1753);writer.close();
            __CLR4_3_11bj1bjjvpn03sp.R.inc(1754);logger.info("file successfully saved");
        } catch (IOException e) {
            __CLR4_3_11bj1bjjvpn03sp.R.inc(1755);logger.error("couldn't write save file");
            __CLR4_3_11bj1bjjvpn03sp.R.inc(1756);e.printStackTrace();
        }

    }finally{__CLR4_3_11bj1bjjvpn03sp.R.flushNeeded();}}

    /**
     * Method for getting the {@code levelNumber} of the next element of the {@code levels} list, if there is one.
     * @return the {@code levelNumber} of the next element of the {@code levels} list, if there is one.
     */
    public String nextLevel(){try{__CLR4_3_11bj1bjjvpn03sp.R.inc(1757);
        __CLR4_3_11bj1bjjvpn03sp.R.inc(1758);logger.info("getting next levelNumber");
        __CLR4_3_11bj1bjjvpn03sp.R.inc(1759);if ((((levelNumber < levels.size()-1)&&(__CLR4_3_11bj1bjjvpn03sp.R.iget(1760)!=0|true))||(__CLR4_3_11bj1bjjvpn03sp.R.iget(1761)==0&false))) {__CLR4_3_11bj1bjjvpn03sp.R.inc(1762);return Integer.toString(levelNumber+ 1);
        }__CLR4_3_11bj1bjjvpn03sp.R.inc(1763);return Integer.toString(levelNumber);
    }finally{__CLR4_3_11bj1bjjvpn03sp.R.flushNeeded();}}

    /**
     * Method for getting the {@code levelNumber} of the previous element of the {@code levels} list, if there is one.
     * @return the {@code levelNumber} of the previous element of the {@code levels} list, if there is one.
     */
    public String previousLevel(){try{__CLR4_3_11bj1bjjvpn03sp.R.inc(1764);
        __CLR4_3_11bj1bjjvpn03sp.R.inc(1765);logger.info("getting previous levelNumber");
        __CLR4_3_11bj1bjjvpn03sp.R.inc(1766);if ((((levelNumber > 0)&&(__CLR4_3_11bj1bjjvpn03sp.R.iget(1767)!=0|true))||(__CLR4_3_11bj1bjjvpn03sp.R.iget(1768)==0&false))) {__CLR4_3_11bj1bjjvpn03sp.R.inc(1769);return Integer.toString(levelNumber - 1);
        }__CLR4_3_11bj1bjjvpn03sp.R.inc(1770);return Integer.toString(levelNumber);
    }finally{__CLR4_3_11bj1bjjvpn03sp.R.flushNeeded();}}

    /**
     * Method for setting up a new level and deleting the used {@code charMap} of the previous level.
     * @param newLevelNumberString the {@code levelNumber} of the new level.
     */
    public void setNewLevel(String newLevelNumberString){try{__CLR4_3_11bj1bjjvpn03sp.R.inc(1771);
        __CLR4_3_11bj1bjjvpn03sp.R.inc(1772);logger.info("setting up next level");
        __CLR4_3_11bj1bjjvpn03sp.R.inc(1773);int newLevelNumberInt = Integer.parseInt(newLevelNumberString);
        __CLR4_3_11bj1bjjvpn03sp.R.inc(1774);setLevelNumber(newLevelNumberInt);
        __CLR4_3_11bj1bjjvpn03sp.R.inc(1775);levels.get(levelNumber).deleteCharMap();
        __CLR4_3_11bj1bjjvpn03sp.R.inc(1776);levels.get(levelNumber).setStep(0);
        __CLR4_3_11bj1bjjvpn03sp.R.inc(1777);levels.get(newLevelNumberInt).newCharMap();
    }finally{__CLR4_3_11bj1bjjvpn03sp.R.flushNeeded();}}

    /**
     * Method for getting the best scale with which can be used to draw the level to the pane.
     * @param pane the pane which is used to the drawing.
     * @return the integer value that represents the best scale with which can be used
     * to draw the level to the pane.
     */
    public int getScale(Pane pane){try{__CLR4_3_11bj1bjjvpn03sp.R.inc(1778);
        __CLR4_3_11bj1bjjvpn03sp.R.inc(1779);logger.info("getting scale of game pane");
        __CLR4_3_11bj1bjjvpn03sp.R.inc(1780);int scale;
        __CLR4_3_11bj1bjjvpn03sp.R.inc(1781);double dispHeight = pane.getHeight();
        __CLR4_3_11bj1bjjvpn03sp.R.inc(1782);double dispWidth = pane.getWidth();

        __CLR4_3_11bj1bjjvpn03sp.R.inc(1783);if ((((dispHeight == 0)&&(__CLR4_3_11bj1bjjvpn03sp.R.iget(1784)!=0|true))||(__CLR4_3_11bj1bjjvpn03sp.R.iget(1785)==0&false))){{
            __CLR4_3_11bj1bjjvpn03sp.R.inc(1786);dispHeight = pane.getPrefHeight();
        }
        }__CLR4_3_11bj1bjjvpn03sp.R.inc(1787);if ((((dispWidth == 0)&&(__CLR4_3_11bj1bjjvpn03sp.R.iget(1788)!=0|true))||(__CLR4_3_11bj1bjjvpn03sp.R.iget(1789)==0&false))){{
            __CLR4_3_11bj1bjjvpn03sp.R.inc(1790);dispWidth = pane.getPrefWidth();
        }

        }__CLR4_3_11bj1bjjvpn03sp.R.inc(1791);int levelHeight = getLevel().getHeight();
        __CLR4_3_11bj1bjjvpn03sp.R.inc(1792);int levelWidth = getLevel().getWidth();

        __CLR4_3_11bj1bjjvpn03sp.R.inc(1793);if ((((dispHeight/levelHeight < dispWidth/levelWidth)&&(__CLR4_3_11bj1bjjvpn03sp.R.iget(1794)!=0|true))||(__CLR4_3_11bj1bjjvpn03sp.R.iget(1795)==0&false))){{
            __CLR4_3_11bj1bjjvpn03sp.R.inc(1796);scale = (int) (dispHeight / levelHeight);
        }
        }else {{
            __CLR4_3_11bj1bjjvpn03sp.R.inc(1797);scale = (int) (dispWidth / levelWidth);
        }
        }__CLR4_3_11bj1bjjvpn03sp.R.inc(1798);return scale;

    }finally{__CLR4_3_11bj1bjjvpn03sp.R.flushNeeded();}}

    /**
     * Returns the Level corresponding to the {@code levelNumber} index.
     * @return the Level corresponding to the {@code levelNumber} index.
     */
    public Level getLevel(){try{__CLR4_3_11bj1bjjvpn03sp.R.inc(1799);
        __CLR4_3_11bj1bjjvpn03sp.R.inc(1800);return levels.get(levelNumber);
    }finally{__CLR4_3_11bj1bjjvpn03sp.R.flushNeeded();}}

    /**
     * Returns the Save corresponding to the {@code levelNumber} index,
     * if there is no such then it creates and returns a new empty Save.
     * @return the Save corresponding to the {@code levelNumber} index,
     * if there is no such then it creates and returns a new empty Save.
     */
    public Save getSave(){try{__CLR4_3_11bj1bjjvpn03sp.R.inc(1801);
        __CLR4_3_11bj1bjjvpn03sp.R.inc(1802);logger.info("trying to get save of level {}", levelNumber);
        __CLR4_3_11bj1bjjvpn03sp.R.inc(1803);if ((((!saves.isEmpty())&&(__CLR4_3_11bj1bjjvpn03sp.R.iget(1804)!=0|true))||(__CLR4_3_11bj1bjjvpn03sp.R.iget(1805)==0&false))) {{
            __CLR4_3_11bj1bjjvpn03sp.R.inc(1806);for (Save save : saves) {{
                __CLR4_3_11bj1bjjvpn03sp.R.inc(1807);if ((((save.getLevelNumber() == levelNumber)&&(__CLR4_3_11bj1bjjvpn03sp.R.iget(1808)!=0|true))||(__CLR4_3_11bj1bjjvpn03sp.R.iget(1809)==0&false))) {{

                    __CLR4_3_11bj1bjjvpn03sp.R.inc(1810);return save;
                }
            }}
        }}
        }__CLR4_3_11bj1bjjvpn03sp.R.inc(1811);logger.info("no save found, making a new one");
        __CLR4_3_11bj1bjjvpn03sp.R.inc(1812);Save newSave = new Save(levelNumber);
        __CLR4_3_11bj1bjjvpn03sp.R.inc(1813);saves.add(newSave);
        __CLR4_3_11bj1bjjvpn03sp.R.inc(1814);return newSave;
    }finally{__CLR4_3_11bj1bjjvpn03sp.R.flushNeeded();}}

    /**
     * Method for clearing out the {@code saves} list.
     */
    public void deleteSaves(){try{__CLR4_3_11bj1bjjvpn03sp.R.inc(1815);
        __CLR4_3_11bj1bjjvpn03sp.R.inc(1816);logger.info("deleting saves");
        __CLR4_3_11bj1bjjvpn03sp.R.inc(1817);saves.clear();
    }finally{__CLR4_3_11bj1bjjvpn03sp.R.flushNeeded();}}






}

