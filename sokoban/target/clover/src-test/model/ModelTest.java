/* $$ This file has been instrumented by Clover 4.3.1#20180921211537623 $$ */package model;

import javafx.scene.layout.Pane;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ModelTest {static class __CLR4_3_1hvhvjvpo50od{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_3_1();if(20180921211537623L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.3.1#20180921211537623,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u007a\u0065\u006e\u006f\u006c\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0073\u007a\u006f\u0066\u0074\u0076\u0065\u0072\u0066\u0065\u006a\u006c\u0065\u0073\u007a\u0074\u0065\u0073\u002f\u0062\u0065\u0061\u0064\u0061\u006e\u0064\u006f\u002f\u0073\u006f\u006b\u006f\u0062\u0061\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1557951569459L,8589935092L,713,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_3_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test
    void nextLevel() {try{__CLR4_3_1hvhvjvpo50od.R.inc(643);
        __CLR4_3_1hvhvjvpo50od.R.inc(644);Model model = new Model();
        __CLR4_3_1hvhvjvpo50od.R.inc(645);List<Level> levels = new ArrayList<>();
        __CLR4_3_1hvhvjvpo50od.R.inc(646);Level level1 = new Level();
        __CLR4_3_1hvhvjvpo50od.R.inc(647);Level level2 = new Level();
        __CLR4_3_1hvhvjvpo50od.R.inc(648);Level level3 = new Level();
        __CLR4_3_1hvhvjvpo50od.R.inc(649);levels.add(level1);
        __CLR4_3_1hvhvjvpo50od.R.inc(650);levels.add(level2);
        __CLR4_3_1hvhvjvpo50od.R.inc(651);levels.add(level3);
        __CLR4_3_1hvhvjvpo50od.R.inc(652);model.setLevels(levels);
        __CLR4_3_1hvhvjvpo50od.R.inc(653);model.setLevelNumber(0);
        __CLR4_3_1hvhvjvpo50od.R.inc(654);assertEquals(model.nextLevel(), "1");
        __CLR4_3_1hvhvjvpo50od.R.inc(655);model.setLevelNumber(2);
        __CLR4_3_1hvhvjvpo50od.R.inc(656);assertEquals(model.nextLevel(), "2");
    }finally{__CLR4_3_1hvhvjvpo50od.R.flushNeeded();}}

    @Test
    void previousLevel() {try{__CLR4_3_1hvhvjvpo50od.R.inc(657);
        __CLR4_3_1hvhvjvpo50od.R.inc(658);Model model = new Model();
        __CLR4_3_1hvhvjvpo50od.R.inc(659);List<Level> levels = new ArrayList<>();
        __CLR4_3_1hvhvjvpo50od.R.inc(660);Level level1 = new Level();
        __CLR4_3_1hvhvjvpo50od.R.inc(661);Level level2 = new Level();
        __CLR4_3_1hvhvjvpo50od.R.inc(662);Level level3 = new Level();
        __CLR4_3_1hvhvjvpo50od.R.inc(663);levels.add(level1);
        __CLR4_3_1hvhvjvpo50od.R.inc(664);levels.add(level2);
        __CLR4_3_1hvhvjvpo50od.R.inc(665);levels.add(level3);
        __CLR4_3_1hvhvjvpo50od.R.inc(666);model.setLevels(levels);
        __CLR4_3_1hvhvjvpo50od.R.inc(667);model.setLevelNumber(2);
        __CLR4_3_1hvhvjvpo50od.R.inc(668);assertEquals(model.previousLevel(), "1");
        __CLR4_3_1hvhvjvpo50od.R.inc(669);model.setLevelNumber(0);
        __CLR4_3_1hvhvjvpo50od.R.inc(670);assertEquals(model.previousLevel(), "0");
    }finally{__CLR4_3_1hvhvjvpo50od.R.flushNeeded();}}

    @Test
    void getLevel() {try{__CLR4_3_1hvhvjvpo50od.R.inc(671);
        __CLR4_3_1hvhvjvpo50od.R.inc(672);Model model = new Model();
        __CLR4_3_1hvhvjvpo50od.R.inc(673);List<Level> levels = new ArrayList<>();
        __CLR4_3_1hvhvjvpo50od.R.inc(674);Level level1 = new Level();
        __CLR4_3_1hvhvjvpo50od.R.inc(675);Level level2 = new Level();
        __CLR4_3_1hvhvjvpo50od.R.inc(676);Level level3 = new Level();
        __CLR4_3_1hvhvjvpo50od.R.inc(677);levels.add(level1);
        __CLR4_3_1hvhvjvpo50od.R.inc(678);levels.add(level2);
        __CLR4_3_1hvhvjvpo50od.R.inc(679);levels.add(level3);
        __CLR4_3_1hvhvjvpo50od.R.inc(680);model.setLevels(levels);
        __CLR4_3_1hvhvjvpo50od.R.inc(681);model.setLevelNumber(1);
        __CLR4_3_1hvhvjvpo50od.R.inc(682);assertEquals(model.getLevel(), level2);
    }finally{__CLR4_3_1hvhvjvpo50od.R.flushNeeded();}}

    @Test
    void getSave() {try{__CLR4_3_1hvhvjvpo50od.R.inc(683);
        __CLR4_3_1hvhvjvpo50od.R.inc(684);Model model = new Model();
        __CLR4_3_1hvhvjvpo50od.R.inc(685);List<Save> saves = new ArrayList<>();
        __CLR4_3_1hvhvjvpo50od.R.inc(686);Save save1 = new Save();
        __CLR4_3_1hvhvjvpo50od.R.inc(687);save1.setLevelNumber(1);
        __CLR4_3_1hvhvjvpo50od.R.inc(688);Save save2 = new Save();
        __CLR4_3_1hvhvjvpo50od.R.inc(689);save2.setLevelNumber(2);
        __CLR4_3_1hvhvjvpo50od.R.inc(690);Save save3 = new Save();
        __CLR4_3_1hvhvjvpo50od.R.inc(691);save3.setLevelNumber(3);
        __CLR4_3_1hvhvjvpo50od.R.inc(692);saves.add(save1);
        __CLR4_3_1hvhvjvpo50od.R.inc(693);saves.add(save2);
        __CLR4_3_1hvhvjvpo50od.R.inc(694);saves.add(save3);
        __CLR4_3_1hvhvjvpo50od.R.inc(695);model.setSaves(saves);

        __CLR4_3_1hvhvjvpo50od.R.inc(696);model.setLevelNumber(2);
        __CLR4_3_1hvhvjvpo50od.R.inc(697);assertEquals(model.getSave(), save2);
        __CLR4_3_1hvhvjvpo50od.R.inc(698);model.setLevelNumber(5);
        __CLR4_3_1hvhvjvpo50od.R.inc(699);assertEquals(model.getSave(), new Save(5));

    }finally{__CLR4_3_1hvhvjvpo50od.R.flushNeeded();}}

    @Test
    void deleteSaves() {try{__CLR4_3_1hvhvjvpo50od.R.inc(700);
        __CLR4_3_1hvhvjvpo50od.R.inc(701);Model model = new Model();
        __CLR4_3_1hvhvjvpo50od.R.inc(702);List<Save> saves = new ArrayList<>();
        __CLR4_3_1hvhvjvpo50od.R.inc(703);Save save1 = new Save();
        __CLR4_3_1hvhvjvpo50od.R.inc(704);Save save2 = new Save();
        __CLR4_3_1hvhvjvpo50od.R.inc(705);Save save3 = new Save();
        __CLR4_3_1hvhvjvpo50od.R.inc(706);saves.add(save1);
        __CLR4_3_1hvhvjvpo50od.R.inc(707);saves.add(save2);
        __CLR4_3_1hvhvjvpo50od.R.inc(708);saves.add(save3);
        __CLR4_3_1hvhvjvpo50od.R.inc(709);model.setSaves(saves);
        __CLR4_3_1hvhvjvpo50od.R.inc(710);assertEquals(model.saves.size(), 3);
        __CLR4_3_1hvhvjvpo50od.R.inc(711);model.deleteSaves();
        __CLR4_3_1hvhvjvpo50od.R.inc(712);assertEquals(model.saves.size(), 0);
    }finally{__CLR4_3_1hvhvjvpo50od.R.flushNeeded();}}
}