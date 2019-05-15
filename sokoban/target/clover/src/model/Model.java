/* $$ This file has been instrumented by Clover 4.3.1#20180921211537623 $$ */package model;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import javafx.scene.layout.Pane;
import lombok.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.*;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;


public class Model {public static class __CLR4_3_15f5fjvp8kaxj{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_3_1();if(20180921211537623L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.3.1#20180921211537623,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u007a\u0065\u006e\u006f\u006c\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0073\u007a\u006f\u0066\u0074\u0076\u0065\u0072\u0066\u0065\u006a\u006c\u0065\u0073\u007a\u0074\u0065\u0073\u002f\u0062\u0065\u0061\u0064\u0061\u006e\u0064\u006f\u002f\u0073\u006f\u006b\u006f\u0062\u0061\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1557925408667L,8589935092L,304,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_3_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    static List<Level> levels;
    static List<Save> saves;
    @Getter @Setter
    static int levelNumber;
    private static Logger logger = LoggerFactory.getLogger(Model.class);


    public Model() {try{__CLR4_3_15f5fjvp8kaxj.R.inc(195);
        __CLR4_3_15f5fjvp8kaxj.R.inc(196);logger.info("constructing Model");
        __CLR4_3_15f5fjvp8kaxj.R.inc(197);this.levelNumber = 0;
        __CLR4_3_15f5fjvp8kaxj.R.inc(198);this.levels = levelFileReader();
        __CLR4_3_15f5fjvp8kaxj.R.inc(199);this.saves = saveFileReader();
        __CLR4_3_15f5fjvp8kaxj.R.inc(200);levels.get(levelNumber).newCharMap();
    }finally{__CLR4_3_15f5fjvp8kaxj.R.flushNeeded();}}

    public List<Level> levelFileReader(){try{__CLR4_3_15f5fjvp8kaxj.R.inc(201);
        __CLR4_3_15f5fjvp8kaxj.R.inc(202);logger.info("reading level file");
        __CLR4_3_15f5fjvp8kaxj.R.inc(203);Gson gson = new GsonBuilder().create();
        __CLR4_3_15f5fjvp8kaxj.R.inc(204);Reader reader = new InputStreamReader(getClass().getResourceAsStream("/json/levels.json"));
        __CLR4_3_15f5fjvp8kaxj.R.inc(205);Type type = new TypeToken<List<Level>>(){}.getType();
        __CLR4_3_15f5fjvp8kaxj.R.inc(206);List<Level>levels = gson.fromJson(reader, type);
        __CLR4_3_15f5fjvp8kaxj.R.inc(207);return levels;

    }finally{__CLR4_3_15f5fjvp8kaxj.R.flushNeeded();}}

    public List<Save> saveFileReader(){try{__CLR4_3_15f5fjvp8kaxj.R.inc(208);
        __CLR4_3_15f5fjvp8kaxj.R.inc(209);logger.info("trying to read save file");
        __CLR4_3_15f5fjvp8kaxj.R.inc(210);List<Save> saves = new ArrayList<>();
        __CLR4_3_15f5fjvp8kaxj.R.inc(211);try {
            __CLR4_3_15f5fjvp8kaxj.R.inc(212);Gson gson = new GsonBuilder().create();
            __CLR4_3_15f5fjvp8kaxj.R.inc(213);Reader reader = null;
            __CLR4_3_15f5fjvp8kaxj.R.inc(214);reader = new FileReader("~/sokoban/save.json");
            __CLR4_3_15f5fjvp8kaxj.R.inc(215);Type type = new TypeToken<List<Save>>(){}.getType();
            __CLR4_3_15f5fjvp8kaxj.R.inc(216);saves = gson.fromJson(reader, type);
            __CLR4_3_15f5fjvp8kaxj.R.inc(217);logger.info("save file successfully red");
        } catch (FileNotFoundException e) {
            __CLR4_3_15f5fjvp8kaxj.R.inc(218);logger.info("no save file found, creating new save");
            __CLR4_3_15f5fjvp8kaxj.R.inc(219);Save newSave = new Save(levelNumber);
            __CLR4_3_15f5fjvp8kaxj.R.inc(220);saves.add(newSave);
        }
        __CLR4_3_15f5fjvp8kaxj.R.inc(221);return saves;
    }finally{__CLR4_3_15f5fjvp8kaxj.R.flushNeeded();}}

    public void saveFileWriter(){try{__CLR4_3_15f5fjvp8kaxj.R.inc(222);
        __CLR4_3_15f5fjvp8kaxj.R.inc(223);logger.info("trying to save");
        __CLR4_3_15f5fjvp8kaxj.R.inc(224);try {
            __CLR4_3_15f5fjvp8kaxj.R.inc(225);File file = new File("~/sokoban/save.json");
            __CLR4_3_15f5fjvp8kaxj.R.inc(226);File parent = file.getParentFile();
            __CLR4_3_15f5fjvp8kaxj.R.inc(227);if ((((!parent.exists() && !parent.mkdirs())&&(__CLR4_3_15f5fjvp8kaxj.R.iget(228)!=0|true))||(__CLR4_3_15f5fjvp8kaxj.R.iget(229)==0&false))) {{
                __CLR4_3_15f5fjvp8kaxj.R.inc(230);throw new IllegalStateException("Couldn't create dir: " + parent);
            }
            }__CLR4_3_15f5fjvp8kaxj.R.inc(231);file.createNewFile();
            __CLR4_3_15f5fjvp8kaxj.R.inc(232);Gson gson = new GsonBuilder().setPrettyPrinting().create();
            __CLR4_3_15f5fjvp8kaxj.R.inc(233);Writer writer = new FileWriter(file);

            __CLR4_3_15f5fjvp8kaxj.R.inc(234);Type type = new TypeToken<List<Save>>() {
            }.getType();
            __CLR4_3_15f5fjvp8kaxj.R.inc(235);String json = gson.toJson(saves, type);

            __CLR4_3_15f5fjvp8kaxj.R.inc(236);writer.write(json);
            __CLR4_3_15f5fjvp8kaxj.R.inc(237);writer.close();
            __CLR4_3_15f5fjvp8kaxj.R.inc(238);logger.info("file successfully saved");
        } catch (IOException e) {
            __CLR4_3_15f5fjvp8kaxj.R.inc(239);logger.error("couldn't write save file");
            __CLR4_3_15f5fjvp8kaxj.R.inc(240);e.printStackTrace();
        }

    }finally{__CLR4_3_15f5fjvp8kaxj.R.flushNeeded();}}

    public String nextLevel(String level){try{__CLR4_3_15f5fjvp8kaxj.R.inc(241);
        __CLR4_3_15f5fjvp8kaxj.R.inc(242);logger.info("geting next level");
        __CLR4_3_15f5fjvp8kaxj.R.inc(243);int integer = Integer.parseInt(level);
        __CLR4_3_15f5fjvp8kaxj.R.inc(244);if ((((integer < levels.size())&&(__CLR4_3_15f5fjvp8kaxj.R.iget(245)!=0|true))||(__CLR4_3_15f5fjvp8kaxj.R.iget(246)==0&false))) {__CLR4_3_15f5fjvp8kaxj.R.inc(247);return Integer.toString(integer + 1);
        }__CLR4_3_15f5fjvp8kaxj.R.inc(248);return level;
    }finally{__CLR4_3_15f5fjvp8kaxj.R.flushNeeded();}}

    public String previousLevel(String level){try{__CLR4_3_15f5fjvp8kaxj.R.inc(249);
        __CLR4_3_15f5fjvp8kaxj.R.inc(250);logger.info("geting previous level");
        __CLR4_3_15f5fjvp8kaxj.R.inc(251);int integer = Integer.parseInt(level);
        __CLR4_3_15f5fjvp8kaxj.R.inc(252);if ((((integer > 0)&&(__CLR4_3_15f5fjvp8kaxj.R.iget(253)!=0|true))||(__CLR4_3_15f5fjvp8kaxj.R.iget(254)==0&false))) {__CLR4_3_15f5fjvp8kaxj.R.inc(255);return Integer.toString(integer - 1);
        }__CLR4_3_15f5fjvp8kaxj.R.inc(256);return level;
    }finally{__CLR4_3_15f5fjvp8kaxj.R.flushNeeded();}}

    public void setNewLevel(String newLevelNumberString){try{__CLR4_3_15f5fjvp8kaxj.R.inc(257);
        __CLR4_3_15f5fjvp8kaxj.R.inc(258);logger.info("setting up next level");
        __CLR4_3_15f5fjvp8kaxj.R.inc(259);int newLevelNumberInt = Integer.parseInt(newLevelNumberString);
        __CLR4_3_15f5fjvp8kaxj.R.inc(260);setLevelNumber(newLevelNumberInt);
        __CLR4_3_15f5fjvp8kaxj.R.inc(261);levels.get(levelNumber).deletCharMap();
        __CLR4_3_15f5fjvp8kaxj.R.inc(262);levels.get(levelNumber).setStep(0);
        __CLR4_3_15f5fjvp8kaxj.R.inc(263);levels.get(newLevelNumberInt).newCharMap();
    }finally{__CLR4_3_15f5fjvp8kaxj.R.flushNeeded();}}




    public int getScale(Pane pane){try{__CLR4_3_15f5fjvp8kaxj.R.inc(264);
        __CLR4_3_15f5fjvp8kaxj.R.inc(265);logger.info("getting scale of game pane");
        __CLR4_3_15f5fjvp8kaxj.R.inc(266);int scale;
        __CLR4_3_15f5fjvp8kaxj.R.inc(267);double dispHeight = pane.getHeight();
        __CLR4_3_15f5fjvp8kaxj.R.inc(268);double dispWidth = pane.getWidth();

        __CLR4_3_15f5fjvp8kaxj.R.inc(269);if ((((dispHeight == 0)&&(__CLR4_3_15f5fjvp8kaxj.R.iget(270)!=0|true))||(__CLR4_3_15f5fjvp8kaxj.R.iget(271)==0&false))){{
            __CLR4_3_15f5fjvp8kaxj.R.inc(272);dispHeight = pane.getPrefHeight();
        }
        }__CLR4_3_15f5fjvp8kaxj.R.inc(273);if ((((dispWidth == 0)&&(__CLR4_3_15f5fjvp8kaxj.R.iget(274)!=0|true))||(__CLR4_3_15f5fjvp8kaxj.R.iget(275)==0&false))){{
            __CLR4_3_15f5fjvp8kaxj.R.inc(276);dispWidth = pane.getPrefWidth();
        }

        }__CLR4_3_15f5fjvp8kaxj.R.inc(277);int levelHeight = getLevel().getHeight();
        __CLR4_3_15f5fjvp8kaxj.R.inc(278);int levelWidth = getLevel().getWidth();

        __CLR4_3_15f5fjvp8kaxj.R.inc(279);if ((((dispHeight/levelHeight < dispWidth/levelWidth)&&(__CLR4_3_15f5fjvp8kaxj.R.iget(280)!=0|true))||(__CLR4_3_15f5fjvp8kaxj.R.iget(281)==0&false))){{
            __CLR4_3_15f5fjvp8kaxj.R.inc(282);scale = (int) (dispHeight / levelHeight);
        }
        }else {{
            __CLR4_3_15f5fjvp8kaxj.R.inc(283);scale = (int) (dispWidth / levelWidth);
        }
        }__CLR4_3_15f5fjvp8kaxj.R.inc(284);return scale;

    }finally{__CLR4_3_15f5fjvp8kaxj.R.flushNeeded();}}

    public Level getLevel(){try{__CLR4_3_15f5fjvp8kaxj.R.inc(285);
        __CLR4_3_15f5fjvp8kaxj.R.inc(286);return levels.get(levelNumber);
    }finally{__CLR4_3_15f5fjvp8kaxj.R.flushNeeded();}}

    public Save getSave(){try{__CLR4_3_15f5fjvp8kaxj.R.inc(287);
        __CLR4_3_15f5fjvp8kaxj.R.inc(288);logger.info("trying to get save of level {}", levelNumber);
        __CLR4_3_15f5fjvp8kaxj.R.inc(289);if ((((!saves.isEmpty())&&(__CLR4_3_15f5fjvp8kaxj.R.iget(290)!=0|true))||(__CLR4_3_15f5fjvp8kaxj.R.iget(291)==0&false))) {{
            __CLR4_3_15f5fjvp8kaxj.R.inc(292);for (Save save : saves) {{
                __CLR4_3_15f5fjvp8kaxj.R.inc(293);if ((((save.getLevelNumber() == levelNumber)&&(__CLR4_3_15f5fjvp8kaxj.R.iget(294)!=0|true))||(__CLR4_3_15f5fjvp8kaxj.R.iget(295)==0&false))) {{

                    __CLR4_3_15f5fjvp8kaxj.R.inc(296);return save;
                }
            }}
        }}
        }__CLR4_3_15f5fjvp8kaxj.R.inc(297);logger.info("no save found, making a new one");
        __CLR4_3_15f5fjvp8kaxj.R.inc(298);Save newSave = new Save(levelNumber);
        __CLR4_3_15f5fjvp8kaxj.R.inc(299);saves.add(newSave);
        __CLR4_3_15f5fjvp8kaxj.R.inc(300);return newSave;
    }finally{__CLR4_3_15f5fjvp8kaxj.R.flushNeeded();}}


    public void deleteSaves(){try{__CLR4_3_15f5fjvp8kaxj.R.inc(301);
        __CLR4_3_15f5fjvp8kaxj.R.inc(302);logger.info("deleting saves");
        __CLR4_3_15f5fjvp8kaxj.R.inc(303);saves.clear();
    }finally{__CLR4_3_15f5fjvp8kaxj.R.flushNeeded();}}






}

