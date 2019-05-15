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

public class Controller implements Initializable {public static class __CLR4_3_1167167jvpmh51r{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_3_1();if(20180921211537623L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.3.1#20180921211537623,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u007a\u0065\u006e\u006f\u006c\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0073\u007a\u006f\u0066\u0074\u0076\u0065\u0072\u0066\u0065\u006a\u006c\u0065\u0073\u007a\u0074\u0065\u0073\u002f\u0062\u0065\u0061\u0064\u0061\u006e\u0064\u006f\u002f\u0073\u006f\u006b\u006f\u0062\u0061\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1557948775760L,8589935092L,1569,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_3_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

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
    public void initialize(URL url, ResourceBundle resourceBundle) {try{__CLR4_3_1167167jvpmh51r.R.inc(1519);
        __CLR4_3_1167167jvpmh51r.R.inc(1520);handleResetClick();
    }finally{__CLR4_3_1167167jvpmh51r.R.flushNeeded();}}

    public void handleKeyPress(KeyEvent keyEvent){try{__CLR4_3_1167167jvpmh51r.R.inc(1521);
        __CLR4_3_1167167jvpmh51r.R.inc(1522);if ((((keyEvent.getText().equals("w"))&&(__CLR4_3_1167167jvpmh51r.R.iget(1523)!=0|true))||(__CLR4_3_1167167jvpmh51r.R.iget(1524)==0&false))) {__CLR4_3_1167167jvpmh51r.R.inc(1525);model.getLevel().move(-1,0);
        }else {__CLR4_3_1167167jvpmh51r.R.inc(1526);if ((((keyEvent.getText().equals("a"))&&(__CLR4_3_1167167jvpmh51r.R.iget(1527)!=0|true))||(__CLR4_3_1167167jvpmh51r.R.iget(1528)==0&false))) {__CLR4_3_1167167jvpmh51r.R.inc(1529);model.getLevel().move(0,-1);
        }else {__CLR4_3_1167167jvpmh51r.R.inc(1530);if ((((keyEvent.getText().equals("s"))&&(__CLR4_3_1167167jvpmh51r.R.iget(1531)!=0|true))||(__CLR4_3_1167167jvpmh51r.R.iget(1532)==0&false))) {__CLR4_3_1167167jvpmh51r.R.inc(1533);model.getLevel().move(1,0);
        }else {__CLR4_3_1167167jvpmh51r.R.inc(1534);if ((((keyEvent.getText().equals("d"))&&(__CLR4_3_1167167jvpmh51r.R.iget(1535)!=0|true))||(__CLR4_3_1167167jvpmh51r.R.iget(1536)==0&false))) {__CLR4_3_1167167jvpmh51r.R.inc(1537);model.getLevel().move(0,1);
        }}}}__CLR4_3_1167167jvpmh51r.R.inc(1538);stepLabel.setText(model.getLevel().getStepToString());

        __CLR4_3_1167167jvpmh51r.R.inc(1539);if ((((model.getLevel().isLevelOver())&&(__CLR4_3_1167167jvpmh51r.R.iget(1540)!=0|true))||(__CLR4_3_1167167jvpmh51r.R.iget(1541)==0&false))) {{
            __CLR4_3_1167167jvpmh51r.R.inc(1542);if ((((model.getSave().isNewRecord(stepLabel.getText()))&&(__CLR4_3_1167167jvpmh51r.R.iget(1543)!=0|true))||(__CLR4_3_1167167jvpmh51r.R.iget(1544)==0&false))) {{
                __CLR4_3_1167167jvpmh51r.R.inc(1545);model.getSave().setRecordStep(stepLabel.getText());
                __CLR4_3_1167167jvpmh51r.R.inc(1546);model.saveFileWriter();
                __CLR4_3_1167167jvpmh51r.R.inc(1547);recordStepsLabel.setText(model.getSave().getRecordStep());
            }

            }__CLR4_3_1167167jvpmh51r.R.inc(1548);gameOverLabel.setText("GAME OVER");
        }
        }__CLR4_3_1167167jvpmh51r.R.inc(1549);View.drowTiles(gamePane, model);
    }finally{__CLR4_3_1167167jvpmh51r.R.flushNeeded();}}

    public void handleResetClick(){try{__CLR4_3_1167167jvpmh51r.R.inc(1550);
        __CLR4_3_1167167jvpmh51r.R.inc(1551);model.setNewLevel(levelNumberLabel.getText());
        __CLR4_3_1167167jvpmh51r.R.inc(1552);model.getLevel().setStep(0);
        __CLR4_3_1167167jvpmh51r.R.inc(1553);stepLabel.setText(model.getLevel().getStepToString());
        __CLR4_3_1167167jvpmh51r.R.inc(1554);mapNameLabel.setText(model.getLevel().getName());
        __CLR4_3_1167167jvpmh51r.R.inc(1555);recordStepsLabel.setText(model.getSave().getRecordStep());
        __CLR4_3_1167167jvpmh51r.R.inc(1556);gameOverLabel.setText("");
        __CLR4_3_1167167jvpmh51r.R.inc(1557);View.drowTiles(gamePane, model);
    }finally{__CLR4_3_1167167jvpmh51r.R.flushNeeded();}}

    public void handleMinusClick(){try{__CLR4_3_1167167jvpmh51r.R.inc(1558);
       // levelNumberLabel.setText(model.previousLevel(levelNumberLabel.getText()));
        __CLR4_3_1167167jvpmh51r.R.inc(1559);levelNumberLabel.setText(model.previousLevel());
        __CLR4_3_1167167jvpmh51r.R.inc(1560);handleResetClick();
    }finally{__CLR4_3_1167167jvpmh51r.R.flushNeeded();}}

    public void handlePlusClick(){try{__CLR4_3_1167167jvpmh51r.R.inc(1561);
      //  levelNumberLabel.setText(model.nextLevel(levelNumberLabel.getText()));
        __CLR4_3_1167167jvpmh51r.R.inc(1562);levelNumberLabel.setText(model.nextLevel());
        __CLR4_3_1167167jvpmh51r.R.inc(1563);handleResetClick();
    }finally{__CLR4_3_1167167jvpmh51r.R.flushNeeded();}}

    public void handleDeleteRecords(){try{__CLR4_3_1167167jvpmh51r.R.inc(1564);
        __CLR4_3_1167167jvpmh51r.R.inc(1565);model.deleteSaves();
        __CLR4_3_1167167jvpmh51r.R.inc(1566);model.saveFileWriter();
        __CLR4_3_1167167jvpmh51r.R.inc(1567);model.getSave();
        __CLR4_3_1167167jvpmh51r.R.inc(1568);handleResetClick();
    }finally{__CLR4_3_1167167jvpmh51r.R.flushNeeded();}}



}
