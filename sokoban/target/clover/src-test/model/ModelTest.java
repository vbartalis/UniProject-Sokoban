/* $$ This file has been instrumented by Clover 4.3.1#20180921211537623 $$ */package model;

import javafx.scene.layout.Pane;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ModelTest {static class __CLR4_3_11f51f5jvpmh56x{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_3_1();if(20180921211537623L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.3.1#20180921211537623,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u007a\u0065\u006e\u006f\u006c\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0073\u007a\u006f\u0066\u0074\u0076\u0065\u0072\u0066\u0065\u006a\u006c\u0065\u0073\u007a\u0074\u0065\u0073\u002f\u0062\u0065\u0061\u0064\u0061\u006e\u0064\u006f\u002f\u0073\u006f\u006b\u006f\u0062\u0061\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1557948776057L,8589935092L,1911,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_3_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test
    void nextLevel() {try{__CLR4_3_11f51f5jvpmh56x.R.inc(1841);
        __CLR4_3_11f51f5jvpmh56x.R.inc(1842);Model model = new Model();
        __CLR4_3_11f51f5jvpmh56x.R.inc(1843);List<Level> levels = new ArrayList<>();
        __CLR4_3_11f51f5jvpmh56x.R.inc(1844);Level level1 = new Level();
        __CLR4_3_11f51f5jvpmh56x.R.inc(1845);Level level2 = new Level();
        __CLR4_3_11f51f5jvpmh56x.R.inc(1846);Level level3 = new Level();
        __CLR4_3_11f51f5jvpmh56x.R.inc(1847);levels.add(level1);
        __CLR4_3_11f51f5jvpmh56x.R.inc(1848);levels.add(level2);
        __CLR4_3_11f51f5jvpmh56x.R.inc(1849);levels.add(level3);
        __CLR4_3_11f51f5jvpmh56x.R.inc(1850);model.setLevels(levels);
        __CLR4_3_11f51f5jvpmh56x.R.inc(1851);model.setLevelNumber(0);
        __CLR4_3_11f51f5jvpmh56x.R.inc(1852);assertEquals(model.nextLevel(), "1");
        __CLR4_3_11f51f5jvpmh56x.R.inc(1853);model.setLevelNumber(2);
        __CLR4_3_11f51f5jvpmh56x.R.inc(1854);assertEquals(model.nextLevel(), "2");
    }finally{__CLR4_3_11f51f5jvpmh56x.R.flushNeeded();}}

    @Test
    void previousLevel() {try{__CLR4_3_11f51f5jvpmh56x.R.inc(1855);
        __CLR4_3_11f51f5jvpmh56x.R.inc(1856);Model model = new Model();
        __CLR4_3_11f51f5jvpmh56x.R.inc(1857);List<Level> levels = new ArrayList<>();
        __CLR4_3_11f51f5jvpmh56x.R.inc(1858);Level level1 = new Level();
        __CLR4_3_11f51f5jvpmh56x.R.inc(1859);Level level2 = new Level();
        __CLR4_3_11f51f5jvpmh56x.R.inc(1860);Level level3 = new Level();
        __CLR4_3_11f51f5jvpmh56x.R.inc(1861);levels.add(level1);
        __CLR4_3_11f51f5jvpmh56x.R.inc(1862);levels.add(level2);
        __CLR4_3_11f51f5jvpmh56x.R.inc(1863);levels.add(level3);
        __CLR4_3_11f51f5jvpmh56x.R.inc(1864);model.setLevels(levels);
        __CLR4_3_11f51f5jvpmh56x.R.inc(1865);model.setLevelNumber(2);
        __CLR4_3_11f51f5jvpmh56x.R.inc(1866);assertEquals(model.previousLevel(), "1");
        __CLR4_3_11f51f5jvpmh56x.R.inc(1867);model.setLevelNumber(0);
        __CLR4_3_11f51f5jvpmh56x.R.inc(1868);assertEquals(model.previousLevel(), "0");
    }finally{__CLR4_3_11f51f5jvpmh56x.R.flushNeeded();}}

    @Test
    void getLevel() {try{__CLR4_3_11f51f5jvpmh56x.R.inc(1869);
        __CLR4_3_11f51f5jvpmh56x.R.inc(1870);Model model = new Model();
        __CLR4_3_11f51f5jvpmh56x.R.inc(1871);List<Level> levels = new ArrayList<>();
        __CLR4_3_11f51f5jvpmh56x.R.inc(1872);Level level1 = new Level();
        __CLR4_3_11f51f5jvpmh56x.R.inc(1873);Level level2 = new Level();
        __CLR4_3_11f51f5jvpmh56x.R.inc(1874);Level level3 = new Level();
        __CLR4_3_11f51f5jvpmh56x.R.inc(1875);levels.add(level1);
        __CLR4_3_11f51f5jvpmh56x.R.inc(1876);levels.add(level2);
        __CLR4_3_11f51f5jvpmh56x.R.inc(1877);levels.add(level3);
        __CLR4_3_11f51f5jvpmh56x.R.inc(1878);model.setLevels(levels);
        __CLR4_3_11f51f5jvpmh56x.R.inc(1879);model.setLevelNumber(1);
        __CLR4_3_11f51f5jvpmh56x.R.inc(1880);assertEquals(model.getLevel(), level2);
    }finally{__CLR4_3_11f51f5jvpmh56x.R.flushNeeded();}}

    @Test
    void getSave() {try{__CLR4_3_11f51f5jvpmh56x.R.inc(1881);
        __CLR4_3_11f51f5jvpmh56x.R.inc(1882);Model model = new Model();
        __CLR4_3_11f51f5jvpmh56x.R.inc(1883);List<Save> saves = new ArrayList<>();
        __CLR4_3_11f51f5jvpmh56x.R.inc(1884);Save save1 = new Save();
        __CLR4_3_11f51f5jvpmh56x.R.inc(1885);save1.setLevelNumber(1);
        __CLR4_3_11f51f5jvpmh56x.R.inc(1886);Save save2 = new Save();
        __CLR4_3_11f51f5jvpmh56x.R.inc(1887);save2.setLevelNumber(2);
        __CLR4_3_11f51f5jvpmh56x.R.inc(1888);Save save3 = new Save();
        __CLR4_3_11f51f5jvpmh56x.R.inc(1889);save3.setLevelNumber(3);
        __CLR4_3_11f51f5jvpmh56x.R.inc(1890);saves.add(save1);
        __CLR4_3_11f51f5jvpmh56x.R.inc(1891);saves.add(save2);
        __CLR4_3_11f51f5jvpmh56x.R.inc(1892);saves.add(save3);
        __CLR4_3_11f51f5jvpmh56x.R.inc(1893);model.setSaves(saves);

        __CLR4_3_11f51f5jvpmh56x.R.inc(1894);model.setLevelNumber(2);
        __CLR4_3_11f51f5jvpmh56x.R.inc(1895);assertEquals(model.getSave(), save2);
        __CLR4_3_11f51f5jvpmh56x.R.inc(1896);model.setLevelNumber(5);
        __CLR4_3_11f51f5jvpmh56x.R.inc(1897);assertEquals(model.getSave(), new Save(5));

    }finally{__CLR4_3_11f51f5jvpmh56x.R.flushNeeded();}}

    @Test
    void deleteSaves() {try{__CLR4_3_11f51f5jvpmh56x.R.inc(1898);
        __CLR4_3_11f51f5jvpmh56x.R.inc(1899);Model model = new Model();
        __CLR4_3_11f51f5jvpmh56x.R.inc(1900);List<Save> saves = new ArrayList<>();
        __CLR4_3_11f51f5jvpmh56x.R.inc(1901);Save save1 = new Save();
        __CLR4_3_11f51f5jvpmh56x.R.inc(1902);Save save2 = new Save();
        __CLR4_3_11f51f5jvpmh56x.R.inc(1903);Save save3 = new Save();
        __CLR4_3_11f51f5jvpmh56x.R.inc(1904);saves.add(save1);
        __CLR4_3_11f51f5jvpmh56x.R.inc(1905);saves.add(save2);
        __CLR4_3_11f51f5jvpmh56x.R.inc(1906);saves.add(save3);
        __CLR4_3_11f51f5jvpmh56x.R.inc(1907);model.setSaves(saves);
        __CLR4_3_11f51f5jvpmh56x.R.inc(1908);assertEquals(model.saves.size(), 3);
        __CLR4_3_11f51f5jvpmh56x.R.inc(1909);model.deleteSaves();
        __CLR4_3_11f51f5jvpmh56x.R.inc(1910);assertEquals(model.saves.size(), 0);
    }finally{__CLR4_3_11f51f5jvpmh56x.R.flushNeeded();}}
}