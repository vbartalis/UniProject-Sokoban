/* $$ This file has been instrumented by Clover 4.3.1#20180921211537623 $$ */import model.Level;
import model.Position;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class LevelTest {static class __CLR4_3_1akakjvp8kb2i{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_3_1();if(20180921211537623L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.3.1#20180921211537623,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u007a\u0065\u006e\u006f\u006c\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0073\u007a\u006f\u0066\u0074\u0076\u0065\u0072\u0066\u0065\u006a\u006c\u0065\u0073\u007a\u0074\u0065\u0073\u002f\u0062\u0065\u0061\u0064\u0061\u006e\u0064\u006f\u002f\u0073\u006f\u006b\u006f\u0062\u0061\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1557925408949L,8589935092L,628,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_3_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    @Test
    void testNewCharMAp() {try{__CLR4_3_1akakjvp8kb2i.R.inc(380);
        __CLR4_3_1akakjvp8kb2i.R.inc(381);List<String> testStringMap = new ArrayList<>();
        __CLR4_3_1akakjvp8kb2i.R.inc(382);List<List<Character>> testCharMap = new ArrayList<>();

        __CLR4_3_1akakjvp8kb2i.R.inc(383);testStringMap.add("######");
        __CLR4_3_1akakjvp8kb2i.R.inc(384);testStringMap.add("# .  #");
        __CLR4_3_1akakjvp8kb2i.R.inc(385);testStringMap.add("# @$ #");
        __CLR4_3_1akakjvp8kb2i.R.inc(386);testStringMap.add("# *  #");
        __CLR4_3_1akakjvp8kb2i.R.inc(387);testStringMap.add("######");

        __CLR4_3_1akakjvp8kb2i.R.inc(388);testCharMap.add(Arrays.asList('#','#','#','#','#','#'));
        __CLR4_3_1akakjvp8kb2i.R.inc(389);testCharMap.add(Arrays.asList('#',' ','.',' ',' ','#'));
        __CLR4_3_1akakjvp8kb2i.R.inc(390);testCharMap.add(Arrays.asList('#',' ','@','$',' ','#'));
        __CLR4_3_1akakjvp8kb2i.R.inc(391);testCharMap.add(Arrays.asList('#',' ','*',' ',' ','#'));
        __CLR4_3_1akakjvp8kb2i.R.inc(392);testCharMap.add(Arrays.asList('#','#','#','#','#','#'));

        __CLR4_3_1akakjvp8kb2i.R.inc(393);Level testLevel = new Level();
        __CLR4_3_1akakjvp8kb2i.R.inc(394);testLevel.setStringMap(testStringMap);
        __CLR4_3_1akakjvp8kb2i.R.inc(395);testLevel.newCharMap();

        __CLR4_3_1akakjvp8kb2i.R.inc(396);assertEquals(testCharMap, testLevel.getCharMap());
    }finally{__CLR4_3_1akakjvp8kb2i.R.flushNeeded();}}

    @Test
    void testMoveUp1() {try{__CLR4_3_1akakjvp8kb2i.R.inc(397);
        __CLR4_3_1akakjvp8kb2i.R.inc(398);List<List<Character>> expectedCharMap1 = new ArrayList<>();
        __CLR4_3_1akakjvp8kb2i.R.inc(399);expectedCharMap1.add(Arrays.asList('#','#','#','#','#','#'));
        __CLR4_3_1akakjvp8kb2i.R.inc(400);expectedCharMap1.add(Arrays.asList('#',' ','+',' ',' ','#'));
        __CLR4_3_1akakjvp8kb2i.R.inc(401);expectedCharMap1.add(Arrays.asList('#',' ',' ','$',' ','#'));
        __CLR4_3_1akakjvp8kb2i.R.inc(402);expectedCharMap1.add(Arrays.asList('#',' ','*',' ',' ','#'));
        __CLR4_3_1akakjvp8kb2i.R.inc(403);expectedCharMap1.add(Arrays.asList('#',' ',' ',' ',' ','#'));
        __CLR4_3_1akakjvp8kb2i.R.inc(404);expectedCharMap1.add(Arrays.asList('#','#','#','#','#','#'));

        __CLR4_3_1akakjvp8kb2i.R.inc(405);List<List<Character>> expectedCharMap2 = new ArrayList<>();
        __CLR4_3_1akakjvp8kb2i.R.inc(406);expectedCharMap2.add(Arrays.asList('#','#','#','#','#','#'));
        __CLR4_3_1akakjvp8kb2i.R.inc(407);expectedCharMap2.add(Arrays.asList('#',' ','.',' ',' ','#'));
        __CLR4_3_1akakjvp8kb2i.R.inc(408);expectedCharMap2.add(Arrays.asList('#','@',' ','$',' ','#'));
        __CLR4_3_1akakjvp8kb2i.R.inc(409);expectedCharMap2.add(Arrays.asList('#',' ','*',' ',' ','#'));
        __CLR4_3_1akakjvp8kb2i.R.inc(410);expectedCharMap2.add(Arrays.asList('#',' ',' ',' ',' ','#'));
        __CLR4_3_1akakjvp8kb2i.R.inc(411);expectedCharMap2.add(Arrays.asList('#','#','#','#','#','#'));

        __CLR4_3_1akakjvp8kb2i.R.inc(412);List<List<Character>> expectedCharMap31 = new ArrayList<>();
        __CLR4_3_1akakjvp8kb2i.R.inc(413);expectedCharMap31.add(Arrays.asList('#','#','#','#','#','#'));
        __CLR4_3_1akakjvp8kb2i.R.inc(414);expectedCharMap31.add(Arrays.asList('#',' ','.',' ',' ','#'));
        __CLR4_3_1akakjvp8kb2i.R.inc(415);expectedCharMap31.add(Arrays.asList('#',' ',' ','$',' ','#'));
        __CLR4_3_1akakjvp8kb2i.R.inc(416);expectedCharMap31.add(Arrays.asList('#',' ','+',' ',' ','#'));
        __CLR4_3_1akakjvp8kb2i.R.inc(417);expectedCharMap31.add(Arrays.asList('#',' ','$',' ',' ','#'));
        __CLR4_3_1akakjvp8kb2i.R.inc(418);expectedCharMap31.add(Arrays.asList('#','#','#','#','#','#'));

        __CLR4_3_1akakjvp8kb2i.R.inc(419);List<List<Character>> expectedCharMap32 = new ArrayList<>();
        __CLR4_3_1akakjvp8kb2i.R.inc(420);expectedCharMap32.add(Arrays.asList('#','#','#','#','#','#'));
        __CLR4_3_1akakjvp8kb2i.R.inc(421);expectedCharMap32.add(Arrays.asList('#',' ','.',' ',' ','#'));
        __CLR4_3_1akakjvp8kb2i.R.inc(422);expectedCharMap32.add(Arrays.asList('#',' ',' ','$','.','#'));
        __CLR4_3_1akakjvp8kb2i.R.inc(423);expectedCharMap32.add(Arrays.asList('#',' ','+',' ',' ','#'));
        __CLR4_3_1akakjvp8kb2i.R.inc(424);expectedCharMap32.add(Arrays.asList('#',' ','*',' ',' ','#'));
        __CLR4_3_1akakjvp8kb2i.R.inc(425);expectedCharMap32.add(Arrays.asList('#','#','#','#','#','#'));

        __CLR4_3_1akakjvp8kb2i.R.inc(426);List<List<Character>> expectedCharMap41 = new ArrayList<>();
        __CLR4_3_1akakjvp8kb2i.R.inc(427);expectedCharMap41.add(Arrays.asList('#','#','#','#','#','#'));
        __CLR4_3_1akakjvp8kb2i.R.inc(428);expectedCharMap41.add(Arrays.asList('#',' ','.',' ',' ','#'));
        __CLR4_3_1akakjvp8kb2i.R.inc(429);expectedCharMap41.add(Arrays.asList('#',' ',' ','@','$','#'));
        __CLR4_3_1akakjvp8kb2i.R.inc(430);expectedCharMap41.add(Arrays.asList('#',' ','*',' ',' ','#'));
        __CLR4_3_1akakjvp8kb2i.R.inc(431);expectedCharMap41.add(Arrays.asList('#',' ',' ',' ',' ','#'));
        __CLR4_3_1akakjvp8kb2i.R.inc(432);expectedCharMap41.add(Arrays.asList('#','#','#','#','#','#'));

        __CLR4_3_1akakjvp8kb2i.R.inc(433);List<List<Character>> expectedCharMap42 = new ArrayList<>();
        __CLR4_3_1akakjvp8kb2i.R.inc(434);expectedCharMap42.add(Arrays.asList('#','#','#','#','#','#'));
        __CLR4_3_1akakjvp8kb2i.R.inc(435);expectedCharMap42.add(Arrays.asList('#',' ','.',' ',' ','#'));
        __CLR4_3_1akakjvp8kb2i.R.inc(436);expectedCharMap42.add(Arrays.asList('#',' ',' ','@','*','#'));
        __CLR4_3_1akakjvp8kb2i.R.inc(437);expectedCharMap42.add(Arrays.asList('#',' ','*',' ',' ','#'));
        __CLR4_3_1akakjvp8kb2i.R.inc(438);expectedCharMap42.add(Arrays.asList('#',' ','.',' ',' ','#'));
        __CLR4_3_1akakjvp8kb2i.R.inc(439);expectedCharMap42.add(Arrays.asList('#','#','#','#','#','#'));

        __CLR4_3_1akakjvp8kb2i.R.inc(440);List<List<Character>> testCharMap1 = new ArrayList<>();
        __CLR4_3_1akakjvp8kb2i.R.inc(441);testCharMap1.add(Arrays.asList('#','#','#','#','#','#'));
        __CLR4_3_1akakjvp8kb2i.R.inc(442);testCharMap1.add(Arrays.asList('#',' ','.',' ',' ','#'));
        __CLR4_3_1akakjvp8kb2i.R.inc(443);testCharMap1.add(Arrays.asList('#',' ','@','$',' ','#'));
        __CLR4_3_1akakjvp8kb2i.R.inc(444);testCharMap1.add(Arrays.asList('#',' ','*',' ',' ','#'));
        __CLR4_3_1akakjvp8kb2i.R.inc(445);testCharMap1.add(Arrays.asList('#',' ',' ',' ',' ','#'));
        __CLR4_3_1akakjvp8kb2i.R.inc(446);testCharMap1.add(Arrays.asList('#','#','#','#','#','#'));
        __CLR4_3_1akakjvp8kb2i.R.inc(447);Level testLevel = new Level();
        __CLR4_3_1akakjvp8kb2i.R.inc(448);testLevel.setCharMap(testCharMap1);
        __CLR4_3_1akakjvp8kb2i.R.inc(449);testLevel.setPlayerPosition(new Position(2,3));
        __CLR4_3_1akakjvp8kb2i.R.inc(450);testLevel.move(-1,0);
        __CLR4_3_1akakjvp8kb2i.R.inc(451);assertEquals(testLevel.getCharMap(), expectedCharMap1);

        __CLR4_3_1akakjvp8kb2i.R.inc(452);testCharMap1 = new ArrayList<>();
        __CLR4_3_1akakjvp8kb2i.R.inc(453);testCharMap1.add(Arrays.asList('#','#','#','#','#','#'));
        __CLR4_3_1akakjvp8kb2i.R.inc(454);testCharMap1.add(Arrays.asList('#',' ','.',' ',' ','#'));
        __CLR4_3_1akakjvp8kb2i.R.inc(455);testCharMap1.add(Arrays.asList('#',' ','@','$',' ','#'));
        __CLR4_3_1akakjvp8kb2i.R.inc(456);testCharMap1.add(Arrays.asList('#',' ','*',' ',' ','#'));
        __CLR4_3_1akakjvp8kb2i.R.inc(457);testCharMap1.add(Arrays.asList('#',' ',' ',' ',' ','#'));
        __CLR4_3_1akakjvp8kb2i.R.inc(458);testCharMap1.add(Arrays.asList('#','#','#','#','#','#'));
        __CLR4_3_1akakjvp8kb2i.R.inc(459);testLevel.setCharMap(testCharMap1);
        __CLR4_3_1akakjvp8kb2i.R.inc(460);testLevel.setPlayerPosition(new Position(2,3));
        __CLR4_3_1akakjvp8kb2i.R.inc(461);testLevel.move(0,-1);
        __CLR4_3_1akakjvp8kb2i.R.inc(462);assertEquals(testLevel.getCharMap(), expectedCharMap2);

        __CLR4_3_1akakjvp8kb2i.R.inc(463);testCharMap1 = new ArrayList<>();
        __CLR4_3_1akakjvp8kb2i.R.inc(464);testCharMap1.add(Arrays.asList('#','#','#','#','#','#'));
        __CLR4_3_1akakjvp8kb2i.R.inc(465);testCharMap1.add(Arrays.asList('#',' ','.',' ',' ','#'));
        __CLR4_3_1akakjvp8kb2i.R.inc(466);testCharMap1.add(Arrays.asList('#',' ','@','$',' ','#'));
        __CLR4_3_1akakjvp8kb2i.R.inc(467);testCharMap1.add(Arrays.asList('#',' ','*',' ',' ','#'));
        __CLR4_3_1akakjvp8kb2i.R.inc(468);testCharMap1.add(Arrays.asList('#',' ',' ',' ',' ','#'));
        __CLR4_3_1akakjvp8kb2i.R.inc(469);testCharMap1.add(Arrays.asList('#','#','#','#','#','#'));
        __CLR4_3_1akakjvp8kb2i.R.inc(470);testLevel.setCharMap(testCharMap1);
        __CLR4_3_1akakjvp8kb2i.R.inc(471);testLevel.setPlayerPosition(new Position(2,3));
        __CLR4_3_1akakjvp8kb2i.R.inc(472);testLevel.move(1,0);
        __CLR4_3_1akakjvp8kb2i.R.inc(473);assertEquals(testLevel.getCharMap(), expectedCharMap31);

        __CLR4_3_1akakjvp8kb2i.R.inc(474);List<List<Character>> testCharMap2 = new ArrayList<>();
        __CLR4_3_1akakjvp8kb2i.R.inc(475);testCharMap2.add(Arrays.asList('#','#','#','#','#','#'));
        __CLR4_3_1akakjvp8kb2i.R.inc(476);testCharMap2.add(Arrays.asList('#',' ','.',' ',' ','#'));
        __CLR4_3_1akakjvp8kb2i.R.inc(477);testCharMap2.add(Arrays.asList('#',' ','@','$','.','#'));
        __CLR4_3_1akakjvp8kb2i.R.inc(478);testCharMap2.add(Arrays.asList('#',' ','*',' ',' ','#'));
        __CLR4_3_1akakjvp8kb2i.R.inc(479);testCharMap2.add(Arrays.asList('#',' ','.',' ',' ','#'));
        __CLR4_3_1akakjvp8kb2i.R.inc(480);testCharMap2.add(Arrays.asList('#','#','#','#','#','#'));
        __CLR4_3_1akakjvp8kb2i.R.inc(481);testLevel.setCharMap(testCharMap2);
        __CLR4_3_1akakjvp8kb2i.R.inc(482);testLevel.setPlayerPosition(new Position(2,3));
        __CLR4_3_1akakjvp8kb2i.R.inc(483);testLevel.move(1,0);
        __CLR4_3_1akakjvp8kb2i.R.inc(484);assertEquals(testLevel.getCharMap(), expectedCharMap32);

        __CLR4_3_1akakjvp8kb2i.R.inc(485);testCharMap1 = new ArrayList<>();
        __CLR4_3_1akakjvp8kb2i.R.inc(486);testCharMap1.add(Arrays.asList('#','#','#','#','#','#'));
        __CLR4_3_1akakjvp8kb2i.R.inc(487);testCharMap1.add(Arrays.asList('#',' ','.',' ',' ','#'));
        __CLR4_3_1akakjvp8kb2i.R.inc(488);testCharMap1.add(Arrays.asList('#',' ','@','$',' ','#'));
        __CLR4_3_1akakjvp8kb2i.R.inc(489);testCharMap1.add(Arrays.asList('#',' ','*',' ',' ','#'));
        __CLR4_3_1akakjvp8kb2i.R.inc(490);testCharMap1.add(Arrays.asList('#',' ',' ',' ',' ','#'));
        __CLR4_3_1akakjvp8kb2i.R.inc(491);testCharMap1.add(Arrays.asList('#','#','#','#','#','#'));
        __CLR4_3_1akakjvp8kb2i.R.inc(492);testLevel.setCharMap(testCharMap1);
        __CLR4_3_1akakjvp8kb2i.R.inc(493);testLevel.setPlayerPosition(new Position(2,3));
        __CLR4_3_1akakjvp8kb2i.R.inc(494);testLevel.move(0,1);
        __CLR4_3_1akakjvp8kb2i.R.inc(495);assertEquals(testLevel.getCharMap(), expectedCharMap41);

        __CLR4_3_1akakjvp8kb2i.R.inc(496);testCharMap2 = new ArrayList<>();
        __CLR4_3_1akakjvp8kb2i.R.inc(497);testCharMap2.add(Arrays.asList('#','#','#','#','#','#'));
        __CLR4_3_1akakjvp8kb2i.R.inc(498);testCharMap2.add(Arrays.asList('#',' ','.',' ',' ','#'));
        __CLR4_3_1akakjvp8kb2i.R.inc(499);testCharMap2.add(Arrays.asList('#',' ','@','$','.','#'));
        __CLR4_3_1akakjvp8kb2i.R.inc(500);testCharMap2.add(Arrays.asList('#',' ','*',' ',' ','#'));
        __CLR4_3_1akakjvp8kb2i.R.inc(501);testCharMap2.add(Arrays.asList('#',' ','.',' ',' ','#'));
        __CLR4_3_1akakjvp8kb2i.R.inc(502);testCharMap2.add(Arrays.asList('#','#','#','#','#','#'));
        __CLR4_3_1akakjvp8kb2i.R.inc(503);testLevel.setCharMap(testCharMap2);
        __CLR4_3_1akakjvp8kb2i.R.inc(504);testLevel.setPlayerPosition(new Position(2,3));
        __CLR4_3_1akakjvp8kb2i.R.inc(505);testLevel.move(0,1);
        __CLR4_3_1akakjvp8kb2i.R.inc(506);assertEquals(testLevel.getCharMap(), expectedCharMap42);
    }finally{__CLR4_3_1akakjvp8kb2i.R.flushNeeded();}}
    @Test
    void testMoveUp2() {try{__CLR4_3_1akakjvp8kb2i.R.inc(507);
        __CLR4_3_1akakjvp8kb2i.R.inc(508);Level testLevel = new Level();

        __CLR4_3_1akakjvp8kb2i.R.inc(509);List<List<Character>> expectedCharMap1 = new ArrayList<>();
        __CLR4_3_1akakjvp8kb2i.R.inc(510);expectedCharMap1.add(Arrays.asList('#','#','#','#','#','#'));
        __CLR4_3_1akakjvp8kb2i.R.inc(511);expectedCharMap1.add(Arrays.asList('#',' ','+',' ',' ','#'));
        __CLR4_3_1akakjvp8kb2i.R.inc(512);expectedCharMap1.add(Arrays.asList('#',' ','.','$',' ','#'));
        __CLR4_3_1akakjvp8kb2i.R.inc(513);expectedCharMap1.add(Arrays.asList('#',' ','*',' ',' ','#'));
        __CLR4_3_1akakjvp8kb2i.R.inc(514);expectedCharMap1.add(Arrays.asList('#',' ',' ',' ',' ','#'));
        __CLR4_3_1akakjvp8kb2i.R.inc(515);expectedCharMap1.add(Arrays.asList('#','#','#','#','#','#'));

        __CLR4_3_1akakjvp8kb2i.R.inc(516);List<List<Character>> expectedCharMap2 = new ArrayList<>();
        __CLR4_3_1akakjvp8kb2i.R.inc(517);expectedCharMap2.add(Arrays.asList('#','#','#','#','#','#'));
        __CLR4_3_1akakjvp8kb2i.R.inc(518);expectedCharMap2.add(Arrays.asList('#',' ','.',' ',' ','#'));
        __CLR4_3_1akakjvp8kb2i.R.inc(519);expectedCharMap2.add(Arrays.asList('#','@','.','$',' ','#'));
        __CLR4_3_1akakjvp8kb2i.R.inc(520);expectedCharMap2.add(Arrays.asList('#',' ','*',' ',' ','#'));
        __CLR4_3_1akakjvp8kb2i.R.inc(521);expectedCharMap2.add(Arrays.asList('#',' ',' ',' ',' ','#'));
        __CLR4_3_1akakjvp8kb2i.R.inc(522);expectedCharMap2.add(Arrays.asList('#','#','#','#','#','#'));

        __CLR4_3_1akakjvp8kb2i.R.inc(523);List<List<Character>> expectedCharMap31 = new ArrayList<>();
        __CLR4_3_1akakjvp8kb2i.R.inc(524);expectedCharMap31.add(Arrays.asList('#','#','#','#','#','#'));
        __CLR4_3_1akakjvp8kb2i.R.inc(525);expectedCharMap31.add(Arrays.asList('#',' ','.',' ',' ','#'));
        __CLR4_3_1akakjvp8kb2i.R.inc(526);expectedCharMap31.add(Arrays.asList('#',' ','.','$',' ','#'));
        __CLR4_3_1akakjvp8kb2i.R.inc(527);expectedCharMap31.add(Arrays.asList('#',' ','+',' ',' ','#'));
        __CLR4_3_1akakjvp8kb2i.R.inc(528);expectedCharMap31.add(Arrays.asList('#',' ','$',' ',' ','#'));
        __CLR4_3_1akakjvp8kb2i.R.inc(529);expectedCharMap31.add(Arrays.asList('#','#','#','#','#','#'));

        __CLR4_3_1akakjvp8kb2i.R.inc(530);List<List<Character>> expectedCharMap32 = new ArrayList<>();
        __CLR4_3_1akakjvp8kb2i.R.inc(531);expectedCharMap32.add(Arrays.asList('#','#','#','#','#','#'));
        __CLR4_3_1akakjvp8kb2i.R.inc(532);expectedCharMap32.add(Arrays.asList('#',' ','.',' ',' ','#'));
        __CLR4_3_1akakjvp8kb2i.R.inc(533);expectedCharMap32.add(Arrays.asList('#',' ','.','$','.','#'));
        __CLR4_3_1akakjvp8kb2i.R.inc(534);expectedCharMap32.add(Arrays.asList('#',' ','+',' ',' ','#'));
        __CLR4_3_1akakjvp8kb2i.R.inc(535);expectedCharMap32.add(Arrays.asList('#',' ','*',' ',' ','#'));
        __CLR4_3_1akakjvp8kb2i.R.inc(536);expectedCharMap32.add(Arrays.asList('#','#','#','#','#','#'));

        __CLR4_3_1akakjvp8kb2i.R.inc(537);List<List<Character>> expectedCharMap41 = new ArrayList<>();
        __CLR4_3_1akakjvp8kb2i.R.inc(538);expectedCharMap41.add(Arrays.asList('#','#','#','#','#','#'));
        __CLR4_3_1akakjvp8kb2i.R.inc(539);expectedCharMap41.add(Arrays.asList('#',' ','.',' ',' ','#'));
        __CLR4_3_1akakjvp8kb2i.R.inc(540);expectedCharMap41.add(Arrays.asList('#',' ','.','@','$','#'));
        __CLR4_3_1akakjvp8kb2i.R.inc(541);expectedCharMap41.add(Arrays.asList('#',' ','*',' ',' ','#'));
        __CLR4_3_1akakjvp8kb2i.R.inc(542);expectedCharMap41.add(Arrays.asList('#',' ',' ',' ',' ','#'));
        __CLR4_3_1akakjvp8kb2i.R.inc(543);expectedCharMap41.add(Arrays.asList('#','#','#','#','#','#'));

        __CLR4_3_1akakjvp8kb2i.R.inc(544);List<List<Character>> expectedCharMap42 = new ArrayList<>();
        __CLR4_3_1akakjvp8kb2i.R.inc(545);expectedCharMap42.add(Arrays.asList('#','#','#','#','#','#'));
        __CLR4_3_1akakjvp8kb2i.R.inc(546);expectedCharMap42.add(Arrays.asList('#',' ','.',' ',' ','#'));
        __CLR4_3_1akakjvp8kb2i.R.inc(547);expectedCharMap42.add(Arrays.asList('#',' ','.','@','*','#'));
        __CLR4_3_1akakjvp8kb2i.R.inc(548);expectedCharMap42.add(Arrays.asList('#',' ','*',' ',' ','#'));
        __CLR4_3_1akakjvp8kb2i.R.inc(549);expectedCharMap42.add(Arrays.asList('#',' ','.',' ',' ','#'));
        __CLR4_3_1akakjvp8kb2i.R.inc(550);expectedCharMap42.add(Arrays.asList('#','#','#','#','#','#'));

        __CLR4_3_1akakjvp8kb2i.R.inc(551);List<List<Character>> testCharMap1 = new ArrayList<>();
        __CLR4_3_1akakjvp8kb2i.R.inc(552);testCharMap1.add(Arrays.asList('#','#','#','#','#','#'));
        __CLR4_3_1akakjvp8kb2i.R.inc(553);testCharMap1.add(Arrays.asList('#',' ','.',' ',' ','#'));
        __CLR4_3_1akakjvp8kb2i.R.inc(554);testCharMap1.add(Arrays.asList('#',' ','+','$',' ','#'));
        __CLR4_3_1akakjvp8kb2i.R.inc(555);testCharMap1.add(Arrays.asList('#',' ','*',' ',' ','#'));
        __CLR4_3_1akakjvp8kb2i.R.inc(556);testCharMap1.add(Arrays.asList('#',' ',' ',' ',' ','#'));
        __CLR4_3_1akakjvp8kb2i.R.inc(557);testCharMap1.add(Arrays.asList('#','#','#','#','#','#'));
        __CLR4_3_1akakjvp8kb2i.R.inc(558);testLevel.setCharMap(testCharMap1);
        __CLR4_3_1akakjvp8kb2i.R.inc(559);testLevel.setPlayerPosition(new Position(2,3));
        __CLR4_3_1akakjvp8kb2i.R.inc(560);testLevel.move(-1,0);
        __CLR4_3_1akakjvp8kb2i.R.inc(561);assertEquals(testLevel.getCharMap(), expectedCharMap1);

        __CLR4_3_1akakjvp8kb2i.R.inc(562);testCharMap1 = new ArrayList<>();
        __CLR4_3_1akakjvp8kb2i.R.inc(563);testCharMap1.add(Arrays.asList('#','#','#','#','#','#'));
        __CLR4_3_1akakjvp8kb2i.R.inc(564);testCharMap1.add(Arrays.asList('#',' ','.',' ',' ','#'));
        __CLR4_3_1akakjvp8kb2i.R.inc(565);testCharMap1.add(Arrays.asList('#',' ','+','$',' ','#'));
        __CLR4_3_1akakjvp8kb2i.R.inc(566);testCharMap1.add(Arrays.asList('#',' ','*',' ',' ','#'));
        __CLR4_3_1akakjvp8kb2i.R.inc(567);testCharMap1.add(Arrays.asList('#',' ',' ',' ',' ','#'));
        __CLR4_3_1akakjvp8kb2i.R.inc(568);testCharMap1.add(Arrays.asList('#','#','#','#','#','#'));
        __CLR4_3_1akakjvp8kb2i.R.inc(569);testLevel.setCharMap(testCharMap1);
        __CLR4_3_1akakjvp8kb2i.R.inc(570);testLevel.setPlayerPosition(new Position(2,3));
        __CLR4_3_1akakjvp8kb2i.R.inc(571);testLevel.move(0,-1);
        __CLR4_3_1akakjvp8kb2i.R.inc(572);assertEquals(testLevel.getCharMap(), expectedCharMap2);

        __CLR4_3_1akakjvp8kb2i.R.inc(573);testCharMap1 = new ArrayList<>();
        __CLR4_3_1akakjvp8kb2i.R.inc(574);testCharMap1.add(Arrays.asList('#','#','#','#','#','#'));
        __CLR4_3_1akakjvp8kb2i.R.inc(575);testCharMap1.add(Arrays.asList('#',' ','.',' ',' ','#'));
        __CLR4_3_1akakjvp8kb2i.R.inc(576);testCharMap1.add(Arrays.asList('#',' ','+','$',' ','#'));
        __CLR4_3_1akakjvp8kb2i.R.inc(577);testCharMap1.add(Arrays.asList('#',' ','*',' ',' ','#'));
        __CLR4_3_1akakjvp8kb2i.R.inc(578);testCharMap1.add(Arrays.asList('#',' ',' ',' ',' ','#'));
        __CLR4_3_1akakjvp8kb2i.R.inc(579);testCharMap1.add(Arrays.asList('#','#','#','#','#','#'));
        __CLR4_3_1akakjvp8kb2i.R.inc(580);testLevel.setCharMap(testCharMap1);
        __CLR4_3_1akakjvp8kb2i.R.inc(581);testLevel.setPlayerPosition(new Position(2,3));
        __CLR4_3_1akakjvp8kb2i.R.inc(582);testLevel.move(1,0);
        __CLR4_3_1akakjvp8kb2i.R.inc(583);assertEquals(testLevel.getCharMap(), expectedCharMap31);

        __CLR4_3_1akakjvp8kb2i.R.inc(584);List<List<Character>> testCharMap2 = new ArrayList<>();
        __CLR4_3_1akakjvp8kb2i.R.inc(585);testCharMap2.add(Arrays.asList('#','#','#','#','#','#'));
        __CLR4_3_1akakjvp8kb2i.R.inc(586);testCharMap2.add(Arrays.asList('#',' ','.',' ',' ','#'));
        __CLR4_3_1akakjvp8kb2i.R.inc(587);testCharMap2.add(Arrays.asList('#',' ','+','$','.','#'));
        __CLR4_3_1akakjvp8kb2i.R.inc(588);testCharMap2.add(Arrays.asList('#',' ','*',' ',' ','#'));
        __CLR4_3_1akakjvp8kb2i.R.inc(589);testCharMap2.add(Arrays.asList('#',' ','.',' ',' ','#'));
        __CLR4_3_1akakjvp8kb2i.R.inc(590);testCharMap2.add(Arrays.asList('#','#','#','#','#','#'));
        __CLR4_3_1akakjvp8kb2i.R.inc(591);testLevel.setCharMap(testCharMap2);
        __CLR4_3_1akakjvp8kb2i.R.inc(592);testLevel.setPlayerPosition(new Position(2,3));
        __CLR4_3_1akakjvp8kb2i.R.inc(593);testLevel.move(1,0);
        __CLR4_3_1akakjvp8kb2i.R.inc(594);assertEquals(testLevel.getCharMap(), expectedCharMap32);

        __CLR4_3_1akakjvp8kb2i.R.inc(595);testCharMap1 = new ArrayList<>();
        __CLR4_3_1akakjvp8kb2i.R.inc(596);testCharMap1.add(Arrays.asList('#','#','#','#','#','#'));
        __CLR4_3_1akakjvp8kb2i.R.inc(597);testCharMap1.add(Arrays.asList('#',' ','.',' ',' ','#'));
        __CLR4_3_1akakjvp8kb2i.R.inc(598);testCharMap1.add(Arrays.asList('#',' ','+','$',' ','#'));
        __CLR4_3_1akakjvp8kb2i.R.inc(599);testCharMap1.add(Arrays.asList('#',' ','*',' ',' ','#'));
        __CLR4_3_1akakjvp8kb2i.R.inc(600);testCharMap1.add(Arrays.asList('#',' ',' ',' ',' ','#'));
        __CLR4_3_1akakjvp8kb2i.R.inc(601);testCharMap1.add(Arrays.asList('#','#','#','#','#','#'));
        __CLR4_3_1akakjvp8kb2i.R.inc(602);testLevel.setCharMap(testCharMap1);
        __CLR4_3_1akakjvp8kb2i.R.inc(603);testLevel.setPlayerPosition(new Position(2,3));
        __CLR4_3_1akakjvp8kb2i.R.inc(604);testLevel.move(0,1);
        __CLR4_3_1akakjvp8kb2i.R.inc(605);assertEquals(testLevel.getCharMap(), expectedCharMap41);

        __CLR4_3_1akakjvp8kb2i.R.inc(606);testCharMap2 = new ArrayList<>();
        __CLR4_3_1akakjvp8kb2i.R.inc(607);testCharMap2.add(Arrays.asList('#','#','#','#','#','#'));
        __CLR4_3_1akakjvp8kb2i.R.inc(608);testCharMap2.add(Arrays.asList('#',' ','.',' ',' ','#'));
        __CLR4_3_1akakjvp8kb2i.R.inc(609);testCharMap2.add(Arrays.asList('#',' ','+','$','.','#'));
        __CLR4_3_1akakjvp8kb2i.R.inc(610);testCharMap2.add(Arrays.asList('#',' ','*',' ',' ','#'));
        __CLR4_3_1akakjvp8kb2i.R.inc(611);testCharMap2.add(Arrays.asList('#',' ','.',' ',' ','#'));
        __CLR4_3_1akakjvp8kb2i.R.inc(612);testCharMap2.add(Arrays.asList('#','#','#','#','#','#'));
        __CLR4_3_1akakjvp8kb2i.R.inc(613);testLevel.setCharMap(testCharMap2);
        __CLR4_3_1akakjvp8kb2i.R.inc(614);testLevel.setPlayerPosition(new Position(2,3));
        __CLR4_3_1akakjvp8kb2i.R.inc(615);testLevel.move(0,1);
        __CLR4_3_1akakjvp8kb2i.R.inc(616);assertEquals(testLevel.getCharMap(), expectedCharMap42);
    }finally{__CLR4_3_1akakjvp8kb2i.R.flushNeeded();}}

    @Test
    void testIsLevelOver() {try{__CLR4_3_1akakjvp8kb2i.R.inc(617);
        __CLR4_3_1akakjvp8kb2i.R.inc(618);List<List<Character>> testCharMap = new ArrayList<>();
        __CLR4_3_1akakjvp8kb2i.R.inc(619);testCharMap.add(Arrays.asList('#','#','#','#','#','#'));
        __CLR4_3_1akakjvp8kb2i.R.inc(620);testCharMap.add(Arrays.asList('#',' ',' ',' ',' ','#'));
        __CLR4_3_1akakjvp8kb2i.R.inc(621);testCharMap.add(Arrays.asList('#',' ','@','$',' ','#'));
        __CLR4_3_1akakjvp8kb2i.R.inc(622);testCharMap.add(Arrays.asList('#',' ','*',' ',' ','#'));
        __CLR4_3_1akakjvp8kb2i.R.inc(623);testCharMap.add(Arrays.asList('#',' ',' ',' ',' ','#'));
        __CLR4_3_1akakjvp8kb2i.R.inc(624);testCharMap.add(Arrays.asList('#','#','#','#','#','#'));

        __CLR4_3_1akakjvp8kb2i.R.inc(625);Level testLevel = new Level();
        __CLR4_3_1akakjvp8kb2i.R.inc(626);testLevel.setCharMap(testCharMap);
        __CLR4_3_1akakjvp8kb2i.R.inc(627);assertTrue(testLevel.isLevelOver());
    }finally{__CLR4_3_1akakjvp8kb2i.R.flushNeeded();}}
}






















