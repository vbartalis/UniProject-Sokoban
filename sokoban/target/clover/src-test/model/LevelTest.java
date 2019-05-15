/* $$ This file has been instrumented by Clover 4.3.1#20180921211537623 $$ */package model;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LevelTest {static class __CLR4_3_1oqoqjvpfjkmy{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_3_1();if(20180921211537623L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.3.1#20180921211537623,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u007a\u0065\u006e\u006f\u006c\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0073\u007a\u006f\u0066\u0074\u0076\u0065\u0072\u0066\u0065\u006a\u006c\u0065\u0073\u007a\u0074\u0065\u0073\u002f\u0062\u0065\u0061\u0064\u0061\u006e\u0064\u006f\u002f\u0073\u006f\u006b\u006f\u0062\u0061\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1557937131980L,8589935092L,1157,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_3_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test
    void newCharMap() {try{__CLR4_3_1oqoqjvpfjkmy.R.inc(890);
        __CLR4_3_1oqoqjvpfjkmy.R.inc(891);List<String> testStringMap = new ArrayList<>();
        __CLR4_3_1oqoqjvpfjkmy.R.inc(892);List<List<Character>> testCharMap = new ArrayList<>();

        __CLR4_3_1oqoqjvpfjkmy.R.inc(893);testStringMap.add("######");
        __CLR4_3_1oqoqjvpfjkmy.R.inc(894);testStringMap.add("# .  #");
        __CLR4_3_1oqoqjvpfjkmy.R.inc(895);testStringMap.add("# @$ #");
        __CLR4_3_1oqoqjvpfjkmy.R.inc(896);testStringMap.add("# *  #");
        __CLR4_3_1oqoqjvpfjkmy.R.inc(897);testStringMap.add("######");

        __CLR4_3_1oqoqjvpfjkmy.R.inc(898);testCharMap.add(Arrays.asList('#','#','#','#','#','#'));
        __CLR4_3_1oqoqjvpfjkmy.R.inc(899);testCharMap.add(Arrays.asList('#',' ','.',' ',' ','#'));
        __CLR4_3_1oqoqjvpfjkmy.R.inc(900);testCharMap.add(Arrays.asList('#',' ','@','$',' ','#'));
        __CLR4_3_1oqoqjvpfjkmy.R.inc(901);testCharMap.add(Arrays.asList('#',' ','*',' ',' ','#'));
        __CLR4_3_1oqoqjvpfjkmy.R.inc(902);testCharMap.add(Arrays.asList('#','#','#','#','#','#'));

        __CLR4_3_1oqoqjvpfjkmy.R.inc(903);Level testLevel = new Level();
        __CLR4_3_1oqoqjvpfjkmy.R.inc(904);testLevel.setStringMap(testStringMap);
        __CLR4_3_1oqoqjvpfjkmy.R.inc(905);testLevel.newCharMap();

        __CLR4_3_1oqoqjvpfjkmy.R.inc(906);assertEquals(testCharMap, testLevel.getCharMap());
    }finally{__CLR4_3_1oqoqjvpfjkmy.R.flushNeeded();}}

    @Test
    void move() {try{__CLR4_3_1oqoqjvpfjkmy.R.inc(907);
        __CLR4_3_1oqoqjvpfjkmy.R.inc(908);List<List<Character>> expectedCharMap1 = new ArrayList<>();
        __CLR4_3_1oqoqjvpfjkmy.R.inc(909);expectedCharMap1.add(Arrays.asList('#','#','#','#','#','#'));
        __CLR4_3_1oqoqjvpfjkmy.R.inc(910);expectedCharMap1.add(Arrays.asList('#',' ','+',' ',' ','#'));
        __CLR4_3_1oqoqjvpfjkmy.R.inc(911);expectedCharMap1.add(Arrays.asList('#',' ',' ','$',' ','#'));
        __CLR4_3_1oqoqjvpfjkmy.R.inc(912);expectedCharMap1.add(Arrays.asList('#',' ','*',' ',' ','#'));
        __CLR4_3_1oqoqjvpfjkmy.R.inc(913);expectedCharMap1.add(Arrays.asList('#',' ',' ',' ',' ','#'));
        __CLR4_3_1oqoqjvpfjkmy.R.inc(914);expectedCharMap1.add(Arrays.asList('#','#','#','#','#','#'));

        __CLR4_3_1oqoqjvpfjkmy.R.inc(915);List<List<Character>> expectedCharMap2 = new ArrayList<>();
        __CLR4_3_1oqoqjvpfjkmy.R.inc(916);expectedCharMap2.add(Arrays.asList('#','#','#','#','#','#'));
        __CLR4_3_1oqoqjvpfjkmy.R.inc(917);expectedCharMap2.add(Arrays.asList('#',' ','.',' ',' ','#'));
        __CLR4_3_1oqoqjvpfjkmy.R.inc(918);expectedCharMap2.add(Arrays.asList('#','@',' ','$',' ','#'));
        __CLR4_3_1oqoqjvpfjkmy.R.inc(919);expectedCharMap2.add(Arrays.asList('#',' ','*',' ',' ','#'));
        __CLR4_3_1oqoqjvpfjkmy.R.inc(920);expectedCharMap2.add(Arrays.asList('#',' ',' ',' ',' ','#'));
        __CLR4_3_1oqoqjvpfjkmy.R.inc(921);expectedCharMap2.add(Arrays.asList('#','#','#','#','#','#'));

        __CLR4_3_1oqoqjvpfjkmy.R.inc(922);List<List<Character>> expectedCharMap31 = new ArrayList<>();
        __CLR4_3_1oqoqjvpfjkmy.R.inc(923);expectedCharMap31.add(Arrays.asList('#','#','#','#','#','#'));
        __CLR4_3_1oqoqjvpfjkmy.R.inc(924);expectedCharMap31.add(Arrays.asList('#',' ','.',' ',' ','#'));
        __CLR4_3_1oqoqjvpfjkmy.R.inc(925);expectedCharMap31.add(Arrays.asList('#',' ',' ','$',' ','#'));
        __CLR4_3_1oqoqjvpfjkmy.R.inc(926);expectedCharMap31.add(Arrays.asList('#',' ','+',' ',' ','#'));
        __CLR4_3_1oqoqjvpfjkmy.R.inc(927);expectedCharMap31.add(Arrays.asList('#',' ','$',' ',' ','#'));
        __CLR4_3_1oqoqjvpfjkmy.R.inc(928);expectedCharMap31.add(Arrays.asList('#','#','#','#','#','#'));

        __CLR4_3_1oqoqjvpfjkmy.R.inc(929);List<List<Character>> expectedCharMap32 = new ArrayList<>();
        __CLR4_3_1oqoqjvpfjkmy.R.inc(930);expectedCharMap32.add(Arrays.asList('#','#','#','#','#','#'));
        __CLR4_3_1oqoqjvpfjkmy.R.inc(931);expectedCharMap32.add(Arrays.asList('#',' ','.',' ',' ','#'));
        __CLR4_3_1oqoqjvpfjkmy.R.inc(932);expectedCharMap32.add(Arrays.asList('#',' ',' ','$','.','#'));
        __CLR4_3_1oqoqjvpfjkmy.R.inc(933);expectedCharMap32.add(Arrays.asList('#',' ','+',' ',' ','#'));
        __CLR4_3_1oqoqjvpfjkmy.R.inc(934);expectedCharMap32.add(Arrays.asList('#',' ','*',' ',' ','#'));
        __CLR4_3_1oqoqjvpfjkmy.R.inc(935);expectedCharMap32.add(Arrays.asList('#','#','#','#','#','#'));

        __CLR4_3_1oqoqjvpfjkmy.R.inc(936);List<List<Character>> expectedCharMap41 = new ArrayList<>();
        __CLR4_3_1oqoqjvpfjkmy.R.inc(937);expectedCharMap41.add(Arrays.asList('#','#','#','#','#','#'));
        __CLR4_3_1oqoqjvpfjkmy.R.inc(938);expectedCharMap41.add(Arrays.asList('#',' ','.',' ',' ','#'));
        __CLR4_3_1oqoqjvpfjkmy.R.inc(939);expectedCharMap41.add(Arrays.asList('#',' ',' ','@','$','#'));
        __CLR4_3_1oqoqjvpfjkmy.R.inc(940);expectedCharMap41.add(Arrays.asList('#',' ','*',' ',' ','#'));
        __CLR4_3_1oqoqjvpfjkmy.R.inc(941);expectedCharMap41.add(Arrays.asList('#',' ',' ',' ',' ','#'));
        __CLR4_3_1oqoqjvpfjkmy.R.inc(942);expectedCharMap41.add(Arrays.asList('#','#','#','#','#','#'));

        __CLR4_3_1oqoqjvpfjkmy.R.inc(943);List<List<Character>> expectedCharMap42 = new ArrayList<>();
        __CLR4_3_1oqoqjvpfjkmy.R.inc(944);expectedCharMap42.add(Arrays.asList('#','#','#','#','#','#'));
        __CLR4_3_1oqoqjvpfjkmy.R.inc(945);expectedCharMap42.add(Arrays.asList('#',' ','.',' ',' ','#'));
        __CLR4_3_1oqoqjvpfjkmy.R.inc(946);expectedCharMap42.add(Arrays.asList('#',' ',' ','@','*','#'));
        __CLR4_3_1oqoqjvpfjkmy.R.inc(947);expectedCharMap42.add(Arrays.asList('#',' ','*',' ',' ','#'));
        __CLR4_3_1oqoqjvpfjkmy.R.inc(948);expectedCharMap42.add(Arrays.asList('#',' ','.',' ',' ','#'));
        __CLR4_3_1oqoqjvpfjkmy.R.inc(949);expectedCharMap42.add(Arrays.asList('#','#','#','#','#','#'));

        __CLR4_3_1oqoqjvpfjkmy.R.inc(950);List<List<Character>> testCharMap1 = new ArrayList<>();
        __CLR4_3_1oqoqjvpfjkmy.R.inc(951);testCharMap1.add(Arrays.asList('#','#','#','#','#','#'));
        __CLR4_3_1oqoqjvpfjkmy.R.inc(952);testCharMap1.add(Arrays.asList('#',' ','.',' ',' ','#'));
        __CLR4_3_1oqoqjvpfjkmy.R.inc(953);testCharMap1.add(Arrays.asList('#',' ','@','$',' ','#'));
        __CLR4_3_1oqoqjvpfjkmy.R.inc(954);testCharMap1.add(Arrays.asList('#',' ','*',' ',' ','#'));
        __CLR4_3_1oqoqjvpfjkmy.R.inc(955);testCharMap1.add(Arrays.asList('#',' ',' ',' ',' ','#'));
        __CLR4_3_1oqoqjvpfjkmy.R.inc(956);testCharMap1.add(Arrays.asList('#','#','#','#','#','#'));
        __CLR4_3_1oqoqjvpfjkmy.R.inc(957);Level testLevel = new Level();
        __CLR4_3_1oqoqjvpfjkmy.R.inc(958);testLevel.setCharMap(testCharMap1);
        __CLR4_3_1oqoqjvpfjkmy.R.inc(959);testLevel.setPlayerPosition(new Position(2,3));
        __CLR4_3_1oqoqjvpfjkmy.R.inc(960);testLevel.move(-1,0);
        __CLR4_3_1oqoqjvpfjkmy.R.inc(961);assertEquals(testLevel.getCharMap(), expectedCharMap1);

        __CLR4_3_1oqoqjvpfjkmy.R.inc(962);testCharMap1 = new ArrayList<>();
        __CLR4_3_1oqoqjvpfjkmy.R.inc(963);testCharMap1.add(Arrays.asList('#','#','#','#','#','#'));
        __CLR4_3_1oqoqjvpfjkmy.R.inc(964);testCharMap1.add(Arrays.asList('#',' ','.',' ',' ','#'));
        __CLR4_3_1oqoqjvpfjkmy.R.inc(965);testCharMap1.add(Arrays.asList('#',' ','@','$',' ','#'));
        __CLR4_3_1oqoqjvpfjkmy.R.inc(966);testCharMap1.add(Arrays.asList('#',' ','*',' ',' ','#'));
        __CLR4_3_1oqoqjvpfjkmy.R.inc(967);testCharMap1.add(Arrays.asList('#',' ',' ',' ',' ','#'));
        __CLR4_3_1oqoqjvpfjkmy.R.inc(968);testCharMap1.add(Arrays.asList('#','#','#','#','#','#'));
        __CLR4_3_1oqoqjvpfjkmy.R.inc(969);testLevel.setCharMap(testCharMap1);
        __CLR4_3_1oqoqjvpfjkmy.R.inc(970);testLevel.setPlayerPosition(new Position(2,3));
        __CLR4_3_1oqoqjvpfjkmy.R.inc(971);testLevel.move(0,-1);
        __CLR4_3_1oqoqjvpfjkmy.R.inc(972);assertEquals(testLevel.getCharMap(), expectedCharMap2);

        __CLR4_3_1oqoqjvpfjkmy.R.inc(973);testCharMap1 = new ArrayList<>();
        __CLR4_3_1oqoqjvpfjkmy.R.inc(974);testCharMap1.add(Arrays.asList('#','#','#','#','#','#'));
        __CLR4_3_1oqoqjvpfjkmy.R.inc(975);testCharMap1.add(Arrays.asList('#',' ','.',' ',' ','#'));
        __CLR4_3_1oqoqjvpfjkmy.R.inc(976);testCharMap1.add(Arrays.asList('#',' ','@','$',' ','#'));
        __CLR4_3_1oqoqjvpfjkmy.R.inc(977);testCharMap1.add(Arrays.asList('#',' ','*',' ',' ','#'));
        __CLR4_3_1oqoqjvpfjkmy.R.inc(978);testCharMap1.add(Arrays.asList('#',' ',' ',' ',' ','#'));
        __CLR4_3_1oqoqjvpfjkmy.R.inc(979);testCharMap1.add(Arrays.asList('#','#','#','#','#','#'));
        __CLR4_3_1oqoqjvpfjkmy.R.inc(980);testLevel.setCharMap(testCharMap1);
        __CLR4_3_1oqoqjvpfjkmy.R.inc(981);testLevel.setPlayerPosition(new Position(2,3));
        __CLR4_3_1oqoqjvpfjkmy.R.inc(982);testLevel.move(1,0);
        __CLR4_3_1oqoqjvpfjkmy.R.inc(983);assertEquals(testLevel.getCharMap(), expectedCharMap31);

        __CLR4_3_1oqoqjvpfjkmy.R.inc(984);List<List<Character>> testCharMap2 = new ArrayList<>();
        __CLR4_3_1oqoqjvpfjkmy.R.inc(985);testCharMap2.add(Arrays.asList('#','#','#','#','#','#'));
        __CLR4_3_1oqoqjvpfjkmy.R.inc(986);testCharMap2.add(Arrays.asList('#',' ','.',' ',' ','#'));
        __CLR4_3_1oqoqjvpfjkmy.R.inc(987);testCharMap2.add(Arrays.asList('#',' ','@','$','.','#'));
        __CLR4_3_1oqoqjvpfjkmy.R.inc(988);testCharMap2.add(Arrays.asList('#',' ','*',' ',' ','#'));
        __CLR4_3_1oqoqjvpfjkmy.R.inc(989);testCharMap2.add(Arrays.asList('#',' ','.',' ',' ','#'));
        __CLR4_3_1oqoqjvpfjkmy.R.inc(990);testCharMap2.add(Arrays.asList('#','#','#','#','#','#'));
        __CLR4_3_1oqoqjvpfjkmy.R.inc(991);testLevel.setCharMap(testCharMap2);
        __CLR4_3_1oqoqjvpfjkmy.R.inc(992);testLevel.setPlayerPosition(new Position(2,3));
        __CLR4_3_1oqoqjvpfjkmy.R.inc(993);testLevel.move(1,0);
        __CLR4_3_1oqoqjvpfjkmy.R.inc(994);assertEquals(testLevel.getCharMap(), expectedCharMap32);

        __CLR4_3_1oqoqjvpfjkmy.R.inc(995);testCharMap1 = new ArrayList<>();
        __CLR4_3_1oqoqjvpfjkmy.R.inc(996);testCharMap1.add(Arrays.asList('#','#','#','#','#','#'));
        __CLR4_3_1oqoqjvpfjkmy.R.inc(997);testCharMap1.add(Arrays.asList('#',' ','.',' ',' ','#'));
        __CLR4_3_1oqoqjvpfjkmy.R.inc(998);testCharMap1.add(Arrays.asList('#',' ','@','$',' ','#'));
        __CLR4_3_1oqoqjvpfjkmy.R.inc(999);testCharMap1.add(Arrays.asList('#',' ','*',' ',' ','#'));
        __CLR4_3_1oqoqjvpfjkmy.R.inc(1000);testCharMap1.add(Arrays.asList('#',' ',' ',' ',' ','#'));
        __CLR4_3_1oqoqjvpfjkmy.R.inc(1001);testCharMap1.add(Arrays.asList('#','#','#','#','#','#'));
        __CLR4_3_1oqoqjvpfjkmy.R.inc(1002);testLevel.setCharMap(testCharMap1);
        __CLR4_3_1oqoqjvpfjkmy.R.inc(1003);testLevel.setPlayerPosition(new Position(2,3));
        __CLR4_3_1oqoqjvpfjkmy.R.inc(1004);testLevel.move(0,1);
        __CLR4_3_1oqoqjvpfjkmy.R.inc(1005);assertEquals(testLevel.getCharMap(), expectedCharMap41);

        __CLR4_3_1oqoqjvpfjkmy.R.inc(1006);testCharMap2 = new ArrayList<>();
        __CLR4_3_1oqoqjvpfjkmy.R.inc(1007);testCharMap2.add(Arrays.asList('#','#','#','#','#','#'));
        __CLR4_3_1oqoqjvpfjkmy.R.inc(1008);testCharMap2.add(Arrays.asList('#',' ','.',' ',' ','#'));
        __CLR4_3_1oqoqjvpfjkmy.R.inc(1009);testCharMap2.add(Arrays.asList('#',' ','@','$','.','#'));
        __CLR4_3_1oqoqjvpfjkmy.R.inc(1010);testCharMap2.add(Arrays.asList('#',' ','*',' ',' ','#'));
        __CLR4_3_1oqoqjvpfjkmy.R.inc(1011);testCharMap2.add(Arrays.asList('#',' ','.',' ',' ','#'));
        __CLR4_3_1oqoqjvpfjkmy.R.inc(1012);testCharMap2.add(Arrays.asList('#','#','#','#','#','#'));
        __CLR4_3_1oqoqjvpfjkmy.R.inc(1013);testLevel.setCharMap(testCharMap2);
        __CLR4_3_1oqoqjvpfjkmy.R.inc(1014);testLevel.setPlayerPosition(new Position(2,3));
        __CLR4_3_1oqoqjvpfjkmy.R.inc(1015);testLevel.move(0,1);
        __CLR4_3_1oqoqjvpfjkmy.R.inc(1016);assertEquals(testLevel.getCharMap(), expectedCharMap42);


        __CLR4_3_1oqoqjvpfjkmy.R.inc(1017);expectedCharMap1 = new ArrayList<>();
        __CLR4_3_1oqoqjvpfjkmy.R.inc(1018);expectedCharMap1.add(Arrays.asList('#','#','#','#','#','#'));
        __CLR4_3_1oqoqjvpfjkmy.R.inc(1019);expectedCharMap1.add(Arrays.asList('#',' ','+',' ',' ','#'));
        __CLR4_3_1oqoqjvpfjkmy.R.inc(1020);expectedCharMap1.add(Arrays.asList('#',' ','.','$',' ','#'));
        __CLR4_3_1oqoqjvpfjkmy.R.inc(1021);expectedCharMap1.add(Arrays.asList('#',' ','*',' ',' ','#'));
        __CLR4_3_1oqoqjvpfjkmy.R.inc(1022);expectedCharMap1.add(Arrays.asList('#',' ',' ',' ',' ','#'));
        __CLR4_3_1oqoqjvpfjkmy.R.inc(1023);expectedCharMap1.add(Arrays.asList('#','#','#','#','#','#'));

        __CLR4_3_1oqoqjvpfjkmy.R.inc(1024);expectedCharMap2 = new ArrayList<>();
        __CLR4_3_1oqoqjvpfjkmy.R.inc(1025);expectedCharMap2.add(Arrays.asList('#','#','#','#','#','#'));
        __CLR4_3_1oqoqjvpfjkmy.R.inc(1026);expectedCharMap2.add(Arrays.asList('#',' ','.',' ',' ','#'));
        __CLR4_3_1oqoqjvpfjkmy.R.inc(1027);expectedCharMap2.add(Arrays.asList('#','@','.','$',' ','#'));
        __CLR4_3_1oqoqjvpfjkmy.R.inc(1028);expectedCharMap2.add(Arrays.asList('#',' ','*',' ',' ','#'));
        __CLR4_3_1oqoqjvpfjkmy.R.inc(1029);expectedCharMap2.add(Arrays.asList('#',' ',' ',' ',' ','#'));
        __CLR4_3_1oqoqjvpfjkmy.R.inc(1030);expectedCharMap2.add(Arrays.asList('#','#','#','#','#','#'));

        __CLR4_3_1oqoqjvpfjkmy.R.inc(1031);expectedCharMap31 = new ArrayList<>();
        __CLR4_3_1oqoqjvpfjkmy.R.inc(1032);expectedCharMap31.add(Arrays.asList('#','#','#','#','#','#'));
        __CLR4_3_1oqoqjvpfjkmy.R.inc(1033);expectedCharMap31.add(Arrays.asList('#',' ','.',' ',' ','#'));
        __CLR4_3_1oqoqjvpfjkmy.R.inc(1034);expectedCharMap31.add(Arrays.asList('#',' ','.','$',' ','#'));
        __CLR4_3_1oqoqjvpfjkmy.R.inc(1035);expectedCharMap31.add(Arrays.asList('#',' ','+',' ',' ','#'));
        __CLR4_3_1oqoqjvpfjkmy.R.inc(1036);expectedCharMap31.add(Arrays.asList('#',' ','$',' ',' ','#'));
        __CLR4_3_1oqoqjvpfjkmy.R.inc(1037);expectedCharMap31.add(Arrays.asList('#','#','#','#','#','#'));

        __CLR4_3_1oqoqjvpfjkmy.R.inc(1038);expectedCharMap32 = new ArrayList<>();
        __CLR4_3_1oqoqjvpfjkmy.R.inc(1039);expectedCharMap32.add(Arrays.asList('#','#','#','#','#','#'));
        __CLR4_3_1oqoqjvpfjkmy.R.inc(1040);expectedCharMap32.add(Arrays.asList('#',' ','.',' ',' ','#'));
        __CLR4_3_1oqoqjvpfjkmy.R.inc(1041);expectedCharMap32.add(Arrays.asList('#',' ','.','$','.','#'));
        __CLR4_3_1oqoqjvpfjkmy.R.inc(1042);expectedCharMap32.add(Arrays.asList('#',' ','+',' ',' ','#'));
        __CLR4_3_1oqoqjvpfjkmy.R.inc(1043);expectedCharMap32.add(Arrays.asList('#',' ','*',' ',' ','#'));
        __CLR4_3_1oqoqjvpfjkmy.R.inc(1044);expectedCharMap32.add(Arrays.asList('#','#','#','#','#','#'));

        __CLR4_3_1oqoqjvpfjkmy.R.inc(1045);expectedCharMap41 = new ArrayList<>();
        __CLR4_3_1oqoqjvpfjkmy.R.inc(1046);expectedCharMap41.add(Arrays.asList('#','#','#','#','#','#'));
        __CLR4_3_1oqoqjvpfjkmy.R.inc(1047);expectedCharMap41.add(Arrays.asList('#',' ','.',' ',' ','#'));
        __CLR4_3_1oqoqjvpfjkmy.R.inc(1048);expectedCharMap41.add(Arrays.asList('#',' ','.','@','$','#'));
        __CLR4_3_1oqoqjvpfjkmy.R.inc(1049);expectedCharMap41.add(Arrays.asList('#',' ','*',' ',' ','#'));
        __CLR4_3_1oqoqjvpfjkmy.R.inc(1050);expectedCharMap41.add(Arrays.asList('#',' ',' ',' ',' ','#'));
        __CLR4_3_1oqoqjvpfjkmy.R.inc(1051);expectedCharMap41.add(Arrays.asList('#','#','#','#','#','#'));

        __CLR4_3_1oqoqjvpfjkmy.R.inc(1052);expectedCharMap42 = new ArrayList<>();
        __CLR4_3_1oqoqjvpfjkmy.R.inc(1053);expectedCharMap42.add(Arrays.asList('#','#','#','#','#','#'));
        __CLR4_3_1oqoqjvpfjkmy.R.inc(1054);expectedCharMap42.add(Arrays.asList('#',' ','.',' ',' ','#'));
        __CLR4_3_1oqoqjvpfjkmy.R.inc(1055);expectedCharMap42.add(Arrays.asList('#',' ','.','@','*','#'));
        __CLR4_3_1oqoqjvpfjkmy.R.inc(1056);expectedCharMap42.add(Arrays.asList('#',' ','*',' ',' ','#'));
        __CLR4_3_1oqoqjvpfjkmy.R.inc(1057);expectedCharMap42.add(Arrays.asList('#',' ','.',' ',' ','#'));
        __CLR4_3_1oqoqjvpfjkmy.R.inc(1058);expectedCharMap42.add(Arrays.asList('#','#','#','#','#','#'));

        __CLR4_3_1oqoqjvpfjkmy.R.inc(1059);testCharMap1 = new ArrayList<>();
        __CLR4_3_1oqoqjvpfjkmy.R.inc(1060);testCharMap1.add(Arrays.asList('#','#','#','#','#','#'));
        __CLR4_3_1oqoqjvpfjkmy.R.inc(1061);testCharMap1.add(Arrays.asList('#',' ','.',' ',' ','#'));
        __CLR4_3_1oqoqjvpfjkmy.R.inc(1062);testCharMap1.add(Arrays.asList('#',' ','+','$',' ','#'));
        __CLR4_3_1oqoqjvpfjkmy.R.inc(1063);testCharMap1.add(Arrays.asList('#',' ','*',' ',' ','#'));
        __CLR4_3_1oqoqjvpfjkmy.R.inc(1064);testCharMap1.add(Arrays.asList('#',' ',' ',' ',' ','#'));
        __CLR4_3_1oqoqjvpfjkmy.R.inc(1065);testCharMap1.add(Arrays.asList('#','#','#','#','#','#'));
        __CLR4_3_1oqoqjvpfjkmy.R.inc(1066);testLevel.setCharMap(testCharMap1);
        __CLR4_3_1oqoqjvpfjkmy.R.inc(1067);testLevel.setPlayerPosition(new Position(2,3));
        __CLR4_3_1oqoqjvpfjkmy.R.inc(1068);testLevel.move(-1,0);
        __CLR4_3_1oqoqjvpfjkmy.R.inc(1069);assertEquals(testLevel.getCharMap(), expectedCharMap1);

        __CLR4_3_1oqoqjvpfjkmy.R.inc(1070);testCharMap1 = new ArrayList<>();
        __CLR4_3_1oqoqjvpfjkmy.R.inc(1071);testCharMap1.add(Arrays.asList('#','#','#','#','#','#'));
        __CLR4_3_1oqoqjvpfjkmy.R.inc(1072);testCharMap1.add(Arrays.asList('#',' ','.',' ',' ','#'));
        __CLR4_3_1oqoqjvpfjkmy.R.inc(1073);testCharMap1.add(Arrays.asList('#',' ','+','$',' ','#'));
        __CLR4_3_1oqoqjvpfjkmy.R.inc(1074);testCharMap1.add(Arrays.asList('#',' ','*',' ',' ','#'));
        __CLR4_3_1oqoqjvpfjkmy.R.inc(1075);testCharMap1.add(Arrays.asList('#',' ',' ',' ',' ','#'));
        __CLR4_3_1oqoqjvpfjkmy.R.inc(1076);testCharMap1.add(Arrays.asList('#','#','#','#','#','#'));
        __CLR4_3_1oqoqjvpfjkmy.R.inc(1077);testLevel.setCharMap(testCharMap1);
        __CLR4_3_1oqoqjvpfjkmy.R.inc(1078);testLevel.setPlayerPosition(new Position(2,3));
        __CLR4_3_1oqoqjvpfjkmy.R.inc(1079);testLevel.move(0,-1);
        __CLR4_3_1oqoqjvpfjkmy.R.inc(1080);assertEquals(testLevel.getCharMap(), expectedCharMap2);

        __CLR4_3_1oqoqjvpfjkmy.R.inc(1081);testCharMap1 = new ArrayList<>();
        __CLR4_3_1oqoqjvpfjkmy.R.inc(1082);testCharMap1.add(Arrays.asList('#','#','#','#','#','#'));
        __CLR4_3_1oqoqjvpfjkmy.R.inc(1083);testCharMap1.add(Arrays.asList('#',' ','.',' ',' ','#'));
        __CLR4_3_1oqoqjvpfjkmy.R.inc(1084);testCharMap1.add(Arrays.asList('#',' ','+','$',' ','#'));
        __CLR4_3_1oqoqjvpfjkmy.R.inc(1085);testCharMap1.add(Arrays.asList('#',' ','*',' ',' ','#'));
        __CLR4_3_1oqoqjvpfjkmy.R.inc(1086);testCharMap1.add(Arrays.asList('#',' ',' ',' ',' ','#'));
        __CLR4_3_1oqoqjvpfjkmy.R.inc(1087);testCharMap1.add(Arrays.asList('#','#','#','#','#','#'));
        __CLR4_3_1oqoqjvpfjkmy.R.inc(1088);testLevel.setCharMap(testCharMap1);
        __CLR4_3_1oqoqjvpfjkmy.R.inc(1089);testLevel.setPlayerPosition(new Position(2,3));
        __CLR4_3_1oqoqjvpfjkmy.R.inc(1090);testLevel.move(1,0);
        __CLR4_3_1oqoqjvpfjkmy.R.inc(1091);assertEquals(testLevel.getCharMap(), expectedCharMap31);

        __CLR4_3_1oqoqjvpfjkmy.R.inc(1092);testCharMap2 = new ArrayList<>();
        __CLR4_3_1oqoqjvpfjkmy.R.inc(1093);testCharMap2.add(Arrays.asList('#','#','#','#','#','#'));
        __CLR4_3_1oqoqjvpfjkmy.R.inc(1094);testCharMap2.add(Arrays.asList('#',' ','.',' ',' ','#'));
        __CLR4_3_1oqoqjvpfjkmy.R.inc(1095);testCharMap2.add(Arrays.asList('#',' ','+','$','.','#'));
        __CLR4_3_1oqoqjvpfjkmy.R.inc(1096);testCharMap2.add(Arrays.asList('#',' ','*',' ',' ','#'));
        __CLR4_3_1oqoqjvpfjkmy.R.inc(1097);testCharMap2.add(Arrays.asList('#',' ','.',' ',' ','#'));
        __CLR4_3_1oqoqjvpfjkmy.R.inc(1098);testCharMap2.add(Arrays.asList('#','#','#','#','#','#'));
        __CLR4_3_1oqoqjvpfjkmy.R.inc(1099);testLevel.setCharMap(testCharMap2);
        __CLR4_3_1oqoqjvpfjkmy.R.inc(1100);testLevel.setPlayerPosition(new Position(2,3));
        __CLR4_3_1oqoqjvpfjkmy.R.inc(1101);testLevel.move(1,0);
        __CLR4_3_1oqoqjvpfjkmy.R.inc(1102);assertEquals(testLevel.getCharMap(), expectedCharMap32);

        __CLR4_3_1oqoqjvpfjkmy.R.inc(1103);testCharMap1 = new ArrayList<>();
        __CLR4_3_1oqoqjvpfjkmy.R.inc(1104);testCharMap1.add(Arrays.asList('#','#','#','#','#','#'));
        __CLR4_3_1oqoqjvpfjkmy.R.inc(1105);testCharMap1.add(Arrays.asList('#',' ','.',' ',' ','#'));
        __CLR4_3_1oqoqjvpfjkmy.R.inc(1106);testCharMap1.add(Arrays.asList('#',' ','+','$',' ','#'));
        __CLR4_3_1oqoqjvpfjkmy.R.inc(1107);testCharMap1.add(Arrays.asList('#',' ','*',' ',' ','#'));
        __CLR4_3_1oqoqjvpfjkmy.R.inc(1108);testCharMap1.add(Arrays.asList('#',' ',' ',' ',' ','#'));
        __CLR4_3_1oqoqjvpfjkmy.R.inc(1109);testCharMap1.add(Arrays.asList('#','#','#','#','#','#'));
        __CLR4_3_1oqoqjvpfjkmy.R.inc(1110);testLevel.setCharMap(testCharMap1);
        __CLR4_3_1oqoqjvpfjkmy.R.inc(1111);testLevel.setPlayerPosition(new Position(2,3));
        __CLR4_3_1oqoqjvpfjkmy.R.inc(1112);testLevel.move(0,1);
        __CLR4_3_1oqoqjvpfjkmy.R.inc(1113);assertEquals(testLevel.getCharMap(), expectedCharMap41);

        __CLR4_3_1oqoqjvpfjkmy.R.inc(1114);testCharMap2 = new ArrayList<>();
        __CLR4_3_1oqoqjvpfjkmy.R.inc(1115);testCharMap2.add(Arrays.asList('#','#','#','#','#','#'));
        __CLR4_3_1oqoqjvpfjkmy.R.inc(1116);testCharMap2.add(Arrays.asList('#',' ','.',' ',' ','#'));
        __CLR4_3_1oqoqjvpfjkmy.R.inc(1117);testCharMap2.add(Arrays.asList('#',' ','+','$','.','#'));
        __CLR4_3_1oqoqjvpfjkmy.R.inc(1118);testCharMap2.add(Arrays.asList('#',' ','*',' ',' ','#'));
        __CLR4_3_1oqoqjvpfjkmy.R.inc(1119);testCharMap2.add(Arrays.asList('#',' ','.',' ',' ','#'));
        __CLR4_3_1oqoqjvpfjkmy.R.inc(1120);testCharMap2.add(Arrays.asList('#','#','#','#','#','#'));
        __CLR4_3_1oqoqjvpfjkmy.R.inc(1121);testLevel.setCharMap(testCharMap2);
        __CLR4_3_1oqoqjvpfjkmy.R.inc(1122);testLevel.setPlayerPosition(new Position(2,3));
        __CLR4_3_1oqoqjvpfjkmy.R.inc(1123);testLevel.move(0,1);
        __CLR4_3_1oqoqjvpfjkmy.R.inc(1124);assertEquals(testLevel.getCharMap(), expectedCharMap42);
    }finally{__CLR4_3_1oqoqjvpfjkmy.R.flushNeeded();}}

    @Test
    void isLevelOver() {try{__CLR4_3_1oqoqjvpfjkmy.R.inc(1125);
        __CLR4_3_1oqoqjvpfjkmy.R.inc(1126);List<List<Character>> testCharMap = new ArrayList<>();
        __CLR4_3_1oqoqjvpfjkmy.R.inc(1127);testCharMap.add(Arrays.asList('#','#','#','#','#','#'));
        __CLR4_3_1oqoqjvpfjkmy.R.inc(1128);testCharMap.add(Arrays.asList('#',' ',' ',' ',' ','#'));
        __CLR4_3_1oqoqjvpfjkmy.R.inc(1129);testCharMap.add(Arrays.asList('#',' ','@','$',' ','#'));
        __CLR4_3_1oqoqjvpfjkmy.R.inc(1130);testCharMap.add(Arrays.asList('#',' ','*',' ',' ','#'));
        __CLR4_3_1oqoqjvpfjkmy.R.inc(1131);testCharMap.add(Arrays.asList('#',' ',' ',' ',' ','#'));
        __CLR4_3_1oqoqjvpfjkmy.R.inc(1132);testCharMap.add(Arrays.asList('#','#','#','#','#','#'));

        __CLR4_3_1oqoqjvpfjkmy.R.inc(1133);Level testLevel = new Level();
        __CLR4_3_1oqoqjvpfjkmy.R.inc(1134);testLevel.setCharMap(testCharMap);
        __CLR4_3_1oqoqjvpfjkmy.R.inc(1135);assertTrue(testLevel.isLevelOver());
    }finally{__CLR4_3_1oqoqjvpfjkmy.R.flushNeeded();}}

    @Test
    void deletCharMap() {try{__CLR4_3_1oqoqjvpfjkmy.R.inc(1136);
        __CLR4_3_1oqoqjvpfjkmy.R.inc(1137);List<List<Character>> testCharMap = new ArrayList<>();
        __CLR4_3_1oqoqjvpfjkmy.R.inc(1138);testCharMap.add(Arrays.asList('#','#','#','#','#','#'));
        __CLR4_3_1oqoqjvpfjkmy.R.inc(1139);testCharMap.add(Arrays.asList('#',' ',' ',' ',' ','#'));
        __CLR4_3_1oqoqjvpfjkmy.R.inc(1140);testCharMap.add(Arrays.asList('#',' ','@','$',' ','#'));
        __CLR4_3_1oqoqjvpfjkmy.R.inc(1141);testCharMap.add(Arrays.asList('#',' ','*',' ',' ','#'));
        __CLR4_3_1oqoqjvpfjkmy.R.inc(1142);testCharMap.add(Arrays.asList('#',' ',' ',' ',' ','#'));
        __CLR4_3_1oqoqjvpfjkmy.R.inc(1143);testCharMap.add(Arrays.asList('#','#','#','#','#','#'));

        __CLR4_3_1oqoqjvpfjkmy.R.inc(1144);Level testLevel = new Level();
        __CLR4_3_1oqoqjvpfjkmy.R.inc(1145);testLevel.setCharMap(testCharMap);
        __CLR4_3_1oqoqjvpfjkmy.R.inc(1146);testLevel.deleteCharMap();
        __CLR4_3_1oqoqjvpfjkmy.R.inc(1147);assertNull(testLevel.getCharMap());
    }finally{__CLR4_3_1oqoqjvpfjkmy.R.flushNeeded();}}

    @Test
    void addStep() {try{__CLR4_3_1oqoqjvpfjkmy.R.inc(1148);
        __CLR4_3_1oqoqjvpfjkmy.R.inc(1149);Level testLevel = new Level();
        __CLR4_3_1oqoqjvpfjkmy.R.inc(1150);testLevel.setStep(0);
        __CLR4_3_1oqoqjvpfjkmy.R.inc(1151);testLevel.addStep();
        __CLR4_3_1oqoqjvpfjkmy.R.inc(1152);assertEquals(testLevel.getStep(), 1);
    }finally{__CLR4_3_1oqoqjvpfjkmy.R.flushNeeded();}}

    @Test
    void getStepToString() {try{__CLR4_3_1oqoqjvpfjkmy.R.inc(1153);
        __CLR4_3_1oqoqjvpfjkmy.R.inc(1154);Level testLevel = new Level();
        __CLR4_3_1oqoqjvpfjkmy.R.inc(1155);testLevel.setStep(51);
        __CLR4_3_1oqoqjvpfjkmy.R.inc(1156);assertEquals(testLevel.getStepToString(), "51");
    }finally{__CLR4_3_1oqoqjvpfjkmy.R.flushNeeded();}}
}