/* $$ This file has been instrumented by Clover 4.3.1#20180921211537623 $$ */package view;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import model.Model;

public class View extends Application {public static class __CLR4_3_19393jvp8kayr{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_3_1();if(20180921211537623L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.3.1#20180921211537623,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u007a\u0065\u006e\u006f\u006c\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0073\u007a\u006f\u0066\u0074\u0076\u0065\u0072\u0066\u0065\u006a\u006c\u0065\u0073\u007a\u0074\u0065\u0073\u002f\u0062\u0065\u0061\u0064\u0061\u006e\u0064\u006f\u002f\u0073\u006f\u006b\u006f\u0062\u0061\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1557925408667L,8589935092L,380,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_3_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;


    public static void main(String[] args) {try{__CLR4_3_19393jvp8kayr.R.inc(327);
        __CLR4_3_19393jvp8kayr.R.inc(328);launch(args);
    }finally{__CLR4_3_19393jvp8kayr.R.flushNeeded();}}

    @Override
    public void start(Stage stage) throws Exception {try{__CLR4_3_19393jvp8kayr.R.inc(329);
        __CLR4_3_19393jvp8kayr.R.inc(330);Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("fxml/game.fxml"));
        __CLR4_3_19393jvp8kayr.R.inc(331);Scene scene = new Scene(root);
        __CLR4_3_19393jvp8kayr.R.inc(332);stage.setTitle("Sokoban");
        __CLR4_3_19393jvp8kayr.R.inc(333);stage.setScene(scene);
        __CLR4_3_19393jvp8kayr.R.inc(334);stage.show();
    }finally{__CLR4_3_19393jvp8kayr.R.flushNeeded();}}

    public static void drowTiles(Pane pane, Model model){try{__CLR4_3_19393jvp8kayr.R.inc(335);
        __CLR4_3_19393jvp8kayr.R.inc(336);Image imgBrick = new Image("/image/brick.jpg"); //#
        __CLR4_3_19393jvp8kayr.R.inc(337);Image imgCrate = new Image("/image/crate.jpg"); //$
        __CLR4_3_19393jvp8kayr.R.inc(338);Image imgCrateDestination = new Image("/image/crateDestination.jpg"); //*
        __CLR4_3_19393jvp8kayr.R.inc(339);Image imgRobotTransparent = new Image("/image/robotTransparent.png"); //@
        __CLR4_3_19393jvp8kayr.R.inc(340);Image imgDestinationTransparent = new Image("/image/destinationTransparent.png"); //.
        __CLR4_3_19393jvp8kayr.R.inc(341);Image imgRobotDestinationTransparent = new Image("/image/robotDestinationTransparent.png"); //+

        __CLR4_3_19393jvp8kayr.R.inc(342);pane.getChildren().clear();
        __CLR4_3_19393jvp8kayr.R.inc(343);int scale = model.getScale(pane);

        __CLR4_3_19393jvp8kayr.R.inc(344);for (int i = 0; (((i < model.getLevel().getCharMap().size())&&(__CLR4_3_19393jvp8kayr.R.iget(345)!=0|true))||(__CLR4_3_19393jvp8kayr.R.iget(346)==0&false)); i++) {{
            __CLR4_3_19393jvp8kayr.R.inc(347);for (int j = 0; (((j < model.getLevel().getCharMap().get(i).size())&&(__CLR4_3_19393jvp8kayr.R.iget(348)!=0|true))||(__CLR4_3_19393jvp8kayr.R.iget(349)==0&false)); j++) {{
                __CLR4_3_19393jvp8kayr.R.inc(350);Rectangle rectangle = new Rectangle(j*(scale) ,i*(scale),scale,scale);
                __CLR4_3_19393jvp8kayr.R.inc(351);if ((((model.getLevel().getCharMap().get(i).get(j) == '#')&&(__CLR4_3_19393jvp8kayr.R.iget(352)!=0|true))||(__CLR4_3_19393jvp8kayr.R.iget(353)==0&false))) {__CLR4_3_19393jvp8kayr.R.inc(354);rectangle.setFill(new ImagePattern(imgBrick));
                }__CLR4_3_19393jvp8kayr.R.inc(355);if ((((model.getLevel().getCharMap().get(i).get(j) == '$')&&(__CLR4_3_19393jvp8kayr.R.iget(356)!=0|true))||(__CLR4_3_19393jvp8kayr.R.iget(357)==0&false))) {__CLR4_3_19393jvp8kayr.R.inc(358);rectangle.setFill(new ImagePattern(imgCrate));
                }__CLR4_3_19393jvp8kayr.R.inc(359);if ((((model.getLevel().getCharMap().get(i).get(j) == ' ')&&(__CLR4_3_19393jvp8kayr.R.iget(360)!=0|true))||(__CLR4_3_19393jvp8kayr.R.iget(361)==0&false))) {__CLR4_3_19393jvp8kayr.R.inc(362);rectangle.setFill(Color.TRANSPARENT);
                }__CLR4_3_19393jvp8kayr.R.inc(363);if ((((model.getLevel().getCharMap().get(i).get(j) == '@')&&(__CLR4_3_19393jvp8kayr.R.iget(364)!=0|true))||(__CLR4_3_19393jvp8kayr.R.iget(365)==0&false))) {__CLR4_3_19393jvp8kayr.R.inc(366);rectangle.setFill(new ImagePattern(imgRobotTransparent));
                }__CLR4_3_19393jvp8kayr.R.inc(367);if ((((model.getLevel().getCharMap().get(i).get(j) == '.')&&(__CLR4_3_19393jvp8kayr.R.iget(368)!=0|true))||(__CLR4_3_19393jvp8kayr.R.iget(369)==0&false))) {__CLR4_3_19393jvp8kayr.R.inc(370);rectangle.setFill(new ImagePattern(imgDestinationTransparent));
                }__CLR4_3_19393jvp8kayr.R.inc(371);if ((((model.getLevel().getCharMap().get(i).get(j) == '*')&&(__CLR4_3_19393jvp8kayr.R.iget(372)!=0|true))||(__CLR4_3_19393jvp8kayr.R.iget(373)==0&false))) {__CLR4_3_19393jvp8kayr.R.inc(374);rectangle.setFill(new ImagePattern(imgCrateDestination));
                }__CLR4_3_19393jvp8kayr.R.inc(375);if ((((model.getLevel().getCharMap().get(i).get(j) == '+')&&(__CLR4_3_19393jvp8kayr.R.iget(376)!=0|true))||(__CLR4_3_19393jvp8kayr.R.iget(377)==0&false))) {__CLR4_3_19393jvp8kayr.R.inc(378);rectangle.setFill(new ImagePattern(imgRobotDestinationTransparent));
                }__CLR4_3_19393jvp8kayr.R.inc(379);pane.getChildren().add(rectangle);
            }
        }}
    }}finally{__CLR4_3_19393jvp8kayr.R.flushNeeded();}}




}