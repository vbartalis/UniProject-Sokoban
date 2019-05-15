/* $$ This file has been instrumented by Clover 4.3.1#20180921211537623 $$ */package controller;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.Pane;
import model.Model;
import view.View;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {public static class __CLR4_3_122jvp8kav2{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_3_1();if(20180921211537623L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.3.1#20180921211537623,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u007a\u0065\u006e\u006f\u006c\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0073\u007a\u006f\u0066\u0074\u0076\u0065\u0072\u0066\u0065\u006a\u006c\u0065\u0073\u007a\u0074\u0065\u0073\u002f\u0062\u0065\u0061\u0064\u0061\u006e\u0064\u006f\u002f\u0073\u006f\u006b\u006f\u0062\u0061\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1557925408667L,8589935092L,52,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_3_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    Model model = new Model();

    @FXML
    private Label levelNumberLabel;
    @FXML
    private Label mapNameLabel;
    @FXML
    private Label stepLabel;
    @FXML
    private Label recordStepsLabel;
    @FXML
    private Pane gamePane;
    @FXML
    private Label gameOverLabel;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {try{__CLR4_3_122jvp8kav2.R.inc(2);
        __CLR4_3_122jvp8kav2.R.inc(3);handleResetClick();
    }finally{__CLR4_3_122jvp8kav2.R.flushNeeded();}}

    public void handleKeyPress(KeyEvent keyEvent){try{__CLR4_3_122jvp8kav2.R.inc(4);
        __CLR4_3_122jvp8kav2.R.inc(5);if ((((keyEvent.getText().equals("w"))&&(__CLR4_3_122jvp8kav2.R.iget(6)!=0|true))||(__CLR4_3_122jvp8kav2.R.iget(7)==0&false))) {__CLR4_3_122jvp8kav2.R.inc(8);model.getLevel().move(-1,0);
        }else {__CLR4_3_122jvp8kav2.R.inc(9);if ((((keyEvent.getText().equals("a"))&&(__CLR4_3_122jvp8kav2.R.iget(10)!=0|true))||(__CLR4_3_122jvp8kav2.R.iget(11)==0&false))) {__CLR4_3_122jvp8kav2.R.inc(12);model.getLevel().move(0,-1);
        }else {__CLR4_3_122jvp8kav2.R.inc(13);if ((((keyEvent.getText().equals("s"))&&(__CLR4_3_122jvp8kav2.R.iget(14)!=0|true))||(__CLR4_3_122jvp8kav2.R.iget(15)==0&false))) {__CLR4_3_122jvp8kav2.R.inc(16);model.getLevel().move(1,0);
        }else {__CLR4_3_122jvp8kav2.R.inc(17);if ((((keyEvent.getText().equals("d"))&&(__CLR4_3_122jvp8kav2.R.iget(18)!=0|true))||(__CLR4_3_122jvp8kav2.R.iget(19)==0&false))) {__CLR4_3_122jvp8kav2.R.inc(20);model.getLevel().move(0,1);
        }}}}__CLR4_3_122jvp8kav2.R.inc(21);stepLabel.setText(model.getLevel().getStepToString());

        __CLR4_3_122jvp8kav2.R.inc(22);if ((((model.getLevel().isLevelOver())&&(__CLR4_3_122jvp8kav2.R.iget(23)!=0|true))||(__CLR4_3_122jvp8kav2.R.iget(24)==0&false))) {{
            __CLR4_3_122jvp8kav2.R.inc(25);if ((((model.getSave().isNewRecord(stepLabel.getText()))&&(__CLR4_3_122jvp8kav2.R.iget(26)!=0|true))||(__CLR4_3_122jvp8kav2.R.iget(27)==0&false))) {{
                __CLR4_3_122jvp8kav2.R.inc(28);model.getSave().setRecordStep(stepLabel.getText());
                __CLR4_3_122jvp8kav2.R.inc(29);model.saveFileWriter();
                __CLR4_3_122jvp8kav2.R.inc(30);recordStepsLabel.setText(model.getSave().getRecordStep());
            }

            }__CLR4_3_122jvp8kav2.R.inc(31);gameOverLabel.setText("GAME OVER");
        }
        }__CLR4_3_122jvp8kav2.R.inc(32);View.drowTiles(gamePane, model);
    }finally{__CLR4_3_122jvp8kav2.R.flushNeeded();}}

    public void handleResetClick(){try{__CLR4_3_122jvp8kav2.R.inc(33);
        __CLR4_3_122jvp8kav2.R.inc(34);model.setNewLevel(levelNumberLabel.getText());
        __CLR4_3_122jvp8kav2.R.inc(35);model.getLevel().setStep(0);
        __CLR4_3_122jvp8kav2.R.inc(36);stepLabel.setText(model.getLevel().getStepToString());
        __CLR4_3_122jvp8kav2.R.inc(37);mapNameLabel.setText(model.getLevel().getName());
        __CLR4_3_122jvp8kav2.R.inc(38);recordStepsLabel.setText(model.getSave().getRecordStep());
        __CLR4_3_122jvp8kav2.R.inc(39);gameOverLabel.setText("");
        __CLR4_3_122jvp8kav2.R.inc(40);View.drowTiles(gamePane, model);
    }finally{__CLR4_3_122jvp8kav2.R.flushNeeded();}}

    public void handleMinusClick(){try{__CLR4_3_122jvp8kav2.R.inc(41);
        __CLR4_3_122jvp8kav2.R.inc(42);levelNumberLabel.setText(model.previousLevel(levelNumberLabel.getText()));
        __CLR4_3_122jvp8kav2.R.inc(43);handleResetClick();
    }finally{__CLR4_3_122jvp8kav2.R.flushNeeded();}}

    public void handlePlusClick(){try{__CLR4_3_122jvp8kav2.R.inc(44);
        __CLR4_3_122jvp8kav2.R.inc(45);levelNumberLabel.setText(model.nextLevel(levelNumberLabel.getText()));
        __CLR4_3_122jvp8kav2.R.inc(46);handleResetClick();
    }finally{__CLR4_3_122jvp8kav2.R.flushNeeded();}}

    public void handleDeleteRecords(){try{__CLR4_3_122jvp8kav2.R.inc(47);
        __CLR4_3_122jvp8kav2.R.inc(48);model.deleteSaves();
        __CLR4_3_122jvp8kav2.R.inc(49);model.saveFileWriter();
        __CLR4_3_122jvp8kav2.R.inc(50);model.getSave();
        __CLR4_3_122jvp8kav2.R.inc(51);handleResetClick();
    }finally{__CLR4_3_122jvp8kav2.R.flushNeeded();}}



}
