/* $$ This file has been instrumented by Clover 4.3.1#20180921211537623 $$ */package model;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LevelTest {static class __CLR4_3_1agagjvpo50nn{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_3_1();if(20180921211537623L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.3.1#20180921211537623,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u007a\u0065\u006e\u006f\u006c\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0073\u007a\u006f\u0066\u0074\u0076\u0065\u0072\u0066\u0065\u006a\u006c\u0065\u0073\u007a\u0074\u0065\u0073\u002f\u0062\u0065\u0061\u0064\u0061\u006e\u0064\u006f\u002f\u0073\u006f\u006b\u006f\u0062\u0061\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1557951569459L,8589935092L,643,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_3_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test
    void newCharMap() {try{__CLR4_3_1agagjvpo50nn.R.inc(376);
        __CLR4_3_1agagjvpo50nn.R.inc(377);List<String> testStringMap = new ArrayList<>();
        __CLR4_3_1agagjvpo50nn.R.inc(378);List<List<Character>> testCharMap = new ArrayList<>();

        __CLR4_3_1agagjvpo50nn.R.inc(379);testStringMap.add("######");
        __CLR4_3_1agagjvpo50nn.R.inc(380);testStringMap.add("# .  #");
        __CLR4_3_1agagjvpo50nn.R.inc(381);testStringMap.add("# @$ #");
        __CLR4_3_1agagjvpo50nn.R.inc(382);testStringMap.add("# *  #");
        __CLR4_3_1agagjvpo50nn.R.inc(383);testStringMap.add("######");

        __CLR4_3_1agagjvpo50nn.R.inc(384);testCharMap.add(Arrays.asList('#','#','#','#','#','#'));
        __CLR4_3_1agagjvpo50nn.R.inc(385);testCharMap.add(Arrays.asList('#',' ','.',' ',' ','#'));
        __CLR4_3_1agagjvpo50nn.R.inc(386);testCharMap.add(Arrays.asList('#',' ','@','$',' ','#'));
        __CLR4_3_1agagjvpo50nn.R.inc(387);testCharMap.add(Arrays.asList('#',' ','*',' ',' ','#'));
        __CLR4_3_1agagjvpo50nn.R.inc(388);testCharMap.add(Arrays.asList('#','#','#','#','#','#'));

        __CLR4_3_1agagjvpo50nn.R.inc(389);Level testLevel = new Level();
        __CLR4_3_1agagjvpo50nn.R.inc(390);testLevel.setStringMap(testStringMap);
        __CLR4_3_1agagjvpo50nn.R.inc(391);testLevel.newCharMap();

        __CLR4_3_1agagjvpo50nn.R.inc(392);assertEquals(testCharMap, testLevel.getCharMap());
    }finally{__CLR4_3_1agagjvpo50nn.R.flushNeeded();}}

    @Test
    void move() {try{__CLR4_3_1agagjvpo50nn.R.inc(393);
        __CLR4_3_1agagjvpo50nn.R.inc(394);List<List<Character>> expectedCharMap1 = new ArrayList<>();
        __CLR4_3_1agagjvpo50nn.R.inc(395);expectedCharMap1.add(Arrays.asList('#','#','#','#','#','#'));
        __CLR4_3_1agagjvpo50nn.R.inc(396);expectedCharMap1.add(Arrays.asList('#',' ','+',' ',' ','#'));
        __CLR4_3_1agagjvpo50nn.R.inc(397);expectedCharMap1.add(Arrays.asList('#',' ',' ','$',' ','#'));
        __CLR4_3_1agagjvpo50nn.R.inc(398);expectedCharMap1.add(Arrays.asList('#',' ','*',' ',' ','#'));
        __CLR4_3_1agagjvpo50nn.R.inc(399);expectedCharMap1.add(Arrays.asList('#',' ',' ',' ',' ','#'));
        __CLR4_3_1agagjvpo50nn.R.inc(400);expectedCharMap1.add(Arrays.asList('#','#','#','#','#','#'));

        __CLR4_3_1agagjvpo50nn.R.inc(401);List<List<Character>> expectedCharMap2 = new ArrayList<>();
        __CLR4_3_1agagjvpo50nn.R.inc(402);expectedCharMap2.add(Arrays.asList('#','#','#','#','#','#'));
        __CLR4_3_1agagjvpo50nn.R.inc(403);expectedCharMap2.add(Arrays.asList('#',' ','.',' ',' ','#'));
        __CLR4_3_1agagjvpo50nn.R.inc(404);expectedCharMap2.add(Arrays.asList('#','@',' ','$',' ','#'));
        __CLR4_3_1agagjvpo50nn.R.inc(405);expectedCharMap2.add(Arrays.asList('#',' ','*',' ',' ','#'));
        __CLR4_3_1agagjvpo50nn.R.inc(406);expectedCharMap2.add(Arrays.asList('#',' ',' ',' ',' ','#'));
        __CLR4_3_1agagjvpo50nn.R.inc(407);expectedCharMap2.add(Arrays.asList('#','#','#','#','#','#'));

        __CLR4_3_1agagjvpo50nn.R.inc(408);List<List<Character>> expectedCharMap31 = new ArrayList<>();
        __CLR4_3_1agagjvpo50nn.R.inc(409);expectedCharMap31.add(Arrays.asList('#','#','#','#','#','#'));
        __CLR4_3_1agagjvpo50nn.R.inc(410);expectedCharMap31.add(Arrays.asList('#',' ','.',' ',' ','#'));
        __CLR4_3_1agagjvpo50nn.R.inc(411);expectedCharMap31.add(Arrays.asList('#',' ',' ','$',' ','#'));
        __CLR4_3_1agagjvpo50nn.R.inc(412);expectedCharMap31.add(Arrays.asList('#',' ','+',' ',' ','#'));
        __CLR4_3_1agagjvpo50nn.R.inc(413);expectedCharMap31.add(Arrays.asList('#',' ','$',' ',' ','#'));
        __CLR4_3_1agagjvpo50nn.R.inc(414);expectedCharMap31.add(Arrays.asList('#','#','#','#','#','#'));

        __CLR4_3_1agagjvpo50nn.R.inc(415);List<List<Character>> expectedCharMap32 = new ArrayList<>();
        __CLR4_3_1agagjvpo50nn.R.inc(416);expectedCharMap32.add(Arrays.asList('#','#','#','#','#','#'));
        __CLR4_3_1agagjvpo50nn.R.inc(417);expectedCharMap32.add(Arrays.asList('#',' ','.',' ',' ','#'));
        __CLR4_3_1agagjvpo50nn.R.inc(418);expectedCharMap32.add(Arrays.asList('#',' ',' ','$','.','#'));
        __CLR4_3_1agagjvpo50nn.R.inc(419);expectedCharMap32.add(Arrays.asList('#',' ','+',' ',' ','#'));
        __CLR4_3_1agagjvpo50nn.R.inc(420);expectedCharMap32.add(Arrays.asList('#',' ','*',' ',' ','#'));
        __CLR4_3_1agagjvpo50nn.R.inc(421);expectedCharMap32.add(Arrays.asList('#','#','#','#','#','#'));

        __CLR4_3_1agagjvpo50nn.R.inc(422);List<List<Character>> expectedCharMap41 = new ArrayList<>();
        __CLR4_3_1agagjvpo50nn.R.inc(423);expectedCharMap41.add(Arrays.asList('#','#','#','#','#','#'));
        __CLR4_3_1agagjvpo50nn.R.inc(424);expectedCharMap41.add(Arrays.asList('#',' ','.',' ',' ','#'));
        __CLR4_3_1agagjvpo50nn.R.inc(425);expectedCharMap41.add(Arrays.asList('#',' ',' ','@','$','#'));
        __CLR4_3_1agagjvpo50nn.R.inc(426);expectedCharMap41.add(Arrays.asList('#',' ','*',' ',' ','#'));
        __CLR4_3_1agagjvpo50nn.R.inc(427);expectedCharMap41.add(Arrays.asList('#',' ',' ',' ',' ','#'));
        __CLR4_3_1agagjvpo50nn.R.inc(428);expectedCharMap41.add(Arrays.asList('#','#','#','#','#','#'));

        __CLR4_3_1agagjvpo50nn.R.inc(429);List<List<Character>> expectedCharMap42 = new ArrayList<>();
        __CLR4_3_1agagjvpo50nn.R.inc(430);expectedCharMap42.add(Arrays.asList('#','#','#','#','#','#'));
        __CLR4_3_1agagjvpo50nn.R.inc(431);expectedCharMap42.add(Arrays.asList('#',' ','.',' ',' ','#'));
        __CLR4_3_1agagjvpo50nn.R.inc(432);expectedCharMap42.add(Arrays.asList('#',' ',' ','@','*','#'));
        __CLR4_3_1agagjvpo50nn.R.inc(433);expectedCharMap42.add(Arrays.asList('#',' ','*',' ',' ','#'));
        __CLR4_3_1agagjvpo50nn.R.inc(434);expectedCharMap42.add(Arrays.asList('#',' ','.',' ',' ','#'));
        __CLR4_3_1agagjvpo50nn.R.inc(435);expectedCharMap42.add(Arrays.asList('#','#','#','#','#','#'));

        __CLR4_3_1agagjvpo50nn.R.inc(436);List<List<Character>> testCharMap1 = new ArrayList<>();
        __CLR4_3_1agagjvpo50nn.R.inc(437);testCharMap1.add(Arrays.asList('#','#','#','#','#','#'));
        __CLR4_3_1agagjvpo50nn.R.inc(438);testCharMap1.add(Arrays.asList('#',' ','.',' ',' ','#'));
        __CLR4_3_1agagjvpo50nn.R.inc(439);testCharMap1.add(Arrays.asList('#',' ','@','$',' ','#'));
        __CLR4_3_1agagjvpo50nn.R.inc(440);testCharMap1.add(Arrays.asList('#',' ','*',' ',' ','#'));
        __CLR4_3_1agagjvpo50nn.R.inc(441);testCharMap1.add(Arrays.asList('#',' ',' ',' ',' ','#'));
        __CLR4_3_1agagjvpo50nn.R.inc(442);testCharMap1.add(Arrays.asList('#','#','#','#','#','#'));
        __CLR4_3_1agagjvpo50nn.R.inc(443);Level testLevel = new Level();
        __CLR4_3_1agagjvpo50nn.R.inc(444);testLevel.setCharMap(testCharMap1);
        __CLR4_3_1agagjvpo50nn.R.inc(445);testLevel.setPlayerPosition(new Position(2,3));
        __CLR4_3_1agagjvpo50nn.R.inc(446);testLevel.move(-1,0);
        __CLR4_3_1agagjvpo50nn.R.inc(447);assertEquals(testLevel.getCharMap(), expectedCharMap1);

        __CLR4_3_1agagjvpo50nn.R.inc(448);testCharMap1 = new ArrayList<>();
        __CLR4_3_1agagjvpo50nn.R.inc(449);testCharMap1.add(Arrays.asList('#','#','#','#','#','#'));
        __CLR4_3_1agagjvpo50nn.R.inc(450);testCharMap1.add(Arrays.asList('#',' ','.',' ',' ','#'));
        __CLR4_3_1agagjvpo50nn.R.inc(451);testCharMap1.add(Arrays.asList('#',' ','@','$',' ','#'));
        __CLR4_3_1agagjvpo50nn.R.inc(452);testCharMap1.add(Arrays.asList('#',' ','*',' ',' ','#'));
        __CLR4_3_1agagjvpo50nn.R.inc(453);testCharMap1.add(Arrays.asList('#',' ',' ',' ',' ','#'));
        __CLR4_3_1agagjvpo50nn.R.inc(454);testCharMap1.add(Arrays.asList('#','#','#','#','#','#'));
        __CLR4_3_1agagjvpo50nn.R.inc(455);testLevel.setCharMap(testCharMap1);
        __CLR4_3_1agagjvpo50nn.R.inc(456);testLevel.setPlayerPosition(new Position(2,3));
        __CLR4_3_1agagjvpo50nn.R.inc(457);testLevel.move(0,-1);
        __CLR4_3_1agagjvpo50nn.R.inc(458);assertEquals(testLevel.getCharMap(), expectedCharMap2);

        __CLR4_3_1agagjvpo50nn.R.inc(459);testCharMap1 = new ArrayList<>();
        __CLR4_3_1agagjvpo50nn.R.inc(460);testCharMap1.add(Arrays.asList('#','#','#','#','#','#'));
        __CLR4_3_1agagjvpo50nn.R.inc(461);testCharMap1.add(Arrays.asList('#',' ','.',' ',' ','#'));
        __CLR4_3_1agagjvpo50nn.R.inc(462);testCharMap1.add(Arrays.asList('#',' ','@','$',' ','#'));
        __CLR4_3_1agagjvpo50nn.R.inc(463);testCharMap1.add(Arrays.asList('#',' ','*',' ',' ','#'));
        __CLR4_3_1agagjvpo50nn.R.inc(464);testCharMap1.add(Arrays.asList('#',' ',' ',' ',' ','#'));
        __CLR4_3_1agagjvpo50nn.R.inc(465);testCharMap1.add(Arrays.asList('#','#','#','#','#','#'));
        __CLR4_3_1agagjvpo50nn.R.inc(466);testLevel.setCharMap(testCharMap1);
        __CLR4_3_1agagjvpo50nn.R.inc(467);testLevel.setPlayerPosition(new Position(2,3));
        __CLR4_3_1agagjvpo50nn.R.inc(468);testLevel.move(1,0);
        __CLR4_3_1agagjvpo50nn.R.inc(469);assertEquals(testLevel.getCharMap(), expectedCharMap31);

        __CLR4_3_1agagjvpo50nn.R.inc(470);List<List<Character>> testCharMap2 = new ArrayList<>();
        __CLR4_3_1agagjvpo50nn.R.inc(471);testCharMap2.add(Arrays.asList('#','#','#','#','#','#'));
        __CLR4_3_1agagjvpo50nn.R.inc(472);testCharMap2.add(Arrays.asList('#',' ','.',' ',' ','#'));
        __CLR4_3_1agagjvpo50nn.R.inc(473);testCharMap2.add(Arrays.asList('#',' ','@','$','.','#'));
        __CLR4_3_1agagjvpo50nn.R.inc(474);testCharMap2.add(Arrays.asList('#',' ','*',' ',' ','#'));
        __CLR4_3_1agagjvpo50nn.R.inc(475);testCharMap2.add(Arrays.asList('#',' ','.',' ',' ','#'));
        __CLR4_3_1agagjvpo50nn.R.inc(476);testCharMap2.add(Arrays.asList('#','#','#','#','#','#'));
        __CLR4_3_1agagjvpo50nn.R.inc(477);testLevel.setCharMap(testCharMap2);
        __CLR4_3_1agagjvpo50nn.R.inc(478);testLevel.setPlayerPosition(new Position(2,3));
        __CLR4_3_1agagjvpo50nn.R.inc(479);testLevel.move(1,0);
        __CLR4_3_1agagjvpo50nn.R.inc(480);assertEquals(testLevel.getCharMap(), expectedCharMap32);

        __CLR4_3_1agagjvpo50nn.R.inc(481);testCharMap1 = new ArrayList<>();
        __CLR4_3_1agagjvpo50nn.R.inc(482);testCharMap1.add(Arrays.asList('#','#','#','#','#','#'));
        __CLR4_3_1agagjvpo50nn.R.inc(483);testCharMap1.add(Arrays.asList('#',' ','.',' ',' ','#'));
        __CLR4_3_1agagjvpo50nn.R.inc(484);testCharMap1.add(Arrays.asList('#',' ','@','$',' ','#'));
        __CLR4_3_1agagjvpo50nn.R.inc(485);testCharMap1.add(Arrays.asList('#',' ','*',' ',' ','#'));
        __CLR4_3_1agagjvpo50nn.R.inc(486);testCharMap1.add(Arrays.asList('#',' ',' ',' ',' ','#'));
        __CLR4_3_1agagjvpo50nn.R.inc(487);testCharMap1.add(Arrays.asList('#','#','#','#','#','#'));
        __CLR4_3_1agagjvpo50nn.R.inc(488);testLevel.setCharMap(testCharMap1);
        __CLR4_3_1agagjvpo50nn.R.inc(489);testLevel.setPlayerPosition(new Position(2,3));
        __CLR4_3_1agagjvpo50nn.R.inc(490);testLevel.move(0,1);
        __CLR4_3_1agagjvpo50nn.R.inc(491);assertEquals(testLevel.getCharMap(), expectedCharMap41);

        __CLR4_3_1agagjvpo50nn.R.inc(492);testCharMap2 = new ArrayList<>();
        __CLR4_3_1agagjvpo50nn.R.inc(493);testCharMap2.add(Arrays.asList('#','#','#','#','#','#'));
        __CLR4_3_1agagjvpo50nn.R.inc(494);testCharMap2.add(Arrays.asList('#',' ','.',' ',' ','#'));
        __CLR4_3_1agagjvpo50nn.R.inc(495);testCharMap2.add(Arrays.asList('#',' ','@','$','.','#'));
        __CLR4_3_1agagjvpo50nn.R.inc(496);testCharMap2.add(Arrays.asList('#',' ','*',' ',' ','#'));
        __CLR4_3_1agagjvpo50nn.R.inc(497);testCharMap2.add(Arrays.asList('#',' ','.',' ',' ','#'));
        __CLR4_3_1agagjvpo50nn.R.inc(498);testCharMap2.add(Arrays.asList('#','#','#','#','#','#'));
        __CLR4_3_1agagjvpo50nn.R.inc(499);testLevel.setCharMap(testCharMap2);
        __CLR4_3_1agagjvpo50nn.R.inc(500);testLevel.setPlayerPosition(new Position(2,3));
        __CLR4_3_1agagjvpo50nn.R.inc(501);testLevel.move(0,1);
        __CLR4_3_1agagjvpo50nn.R.inc(502);assertEquals(testLevel.getCharMap(), expectedCharMap42);


        __CLR4_3_1agagjvpo50nn.R.inc(503);expectedCharMap1 = new ArrayList<>();
        __CLR4_3_1agagjvpo50nn.R.inc(504);expectedCharMap1.add(Arrays.asList('#','#','#','#','#','#'));
        __CLR4_3_1agagjvpo50nn.R.inc(505);expectedCharMap1.add(Arrays.asList('#',' ','+',' ',' ','#'));
        __CLR4_3_1agagjvpo50nn.R.inc(506);expectedCharMap1.add(Arrays.asList('#',' ','.','$',' ','#'));
        __CLR4_3_1agagjvpo50nn.R.inc(507);expectedCharMap1.add(Arrays.asList('#',' ','*',' ',' ','#'));
        __CLR4_3_1agagjvpo50nn.R.inc(508);expectedCharMap1.add(Arrays.asList('#',' ',' ',' ',' ','#'));
        __CLR4_3_1agagjvpo50nn.R.inc(509);expectedCharMap1.add(Arrays.asList('#','#','#','#','#','#'));

        __CLR4_3_1agagjvpo50nn.R.inc(510);expectedCharMap2 = new ArrayList<>();
        __CLR4_3_1agagjvpo50nn.R.inc(511);expectedCharMap2.add(Arrays.asList('#','#','#','#','#','#'));
        __CLR4_3_1agagjvpo50nn.R.inc(512);expectedCharMap2.add(Arrays.asList('#',' ','.',' ',' ','#'));
        __CLR4_3_1agagjvpo50nn.R.inc(513);expectedCharMap2.add(Arrays.asList('#','@','.','$',' ','#'));
        __CLR4_3_1agagjvpo50nn.R.inc(514);expectedCharMap2.add(Arrays.asList('#',' ','*',' ',' ','#'));
        __CLR4_3_1agagjvpo50nn.R.inc(515);expectedCharMap2.add(Arrays.asList('#',' ',' ',' ',' ','#'));
        __CLR4_3_1agagjvpo50nn.R.inc(516);expectedCharMap2.add(Arrays.asList('#','#','#','#','#','#'));

        __CLR4_3_1agagjvpo50nn.R.inc(517);expectedCharMap31 = new ArrayList<>();
        __CLR4_3_1agagjvpo50nn.R.inc(518);expectedCharMap31.add(Arrays.asList('#','#','#','#','#','#'));
        __CLR4_3_1agagjvpo50nn.R.inc(519);expectedCharMap31.add(Arrays.asList('#',' ','.',' ',' ','#'));
        __CLR4_3_1agagjvpo50nn.R.inc(520);expectedCharMap31.add(Arrays.asList('#',' ','.','$',' ','#'));
        __CLR4_3_1agagjvpo50nn.R.inc(521);expectedCharMap31.add(Arrays.asList('#',' ','+',' ',' ','#'));
        __CLR4_3_1agagjvpo50nn.R.inc(522);expectedCharMap31.add(Arrays.asList('#',' ','$',' ',' ','#'));
        __CLR4_3_1agagjvpo50nn.R.inc(523);expectedCharMap31.add(Arrays.asList('#','#','#','#','#','#'));

        __CLR4_3_1agagjvpo50nn.R.inc(524);expectedCharMap32 = new ArrayList<>();
        __CLR4_3_1agagjvpo50nn.R.inc(525);expectedCharMap32.add(Arrays.asList('#','#','#','#','#','#'));
        __CLR4_3_1agagjvpo50nn.R.inc(526);expectedCharMap32.add(Arrays.asList('#',' ','.',' ',' ','#'));
        __CLR4_3_1agagjvpo50nn.R.inc(527);expectedCharMap32.add(Arrays.asList('#',' ','.','$','.','#'));
        __CLR4_3_1agagjvpo50nn.R.inc(528);expectedCharMap32.add(Arrays.asList('#',' ','+',' ',' ','#'));
        __CLR4_3_1agagjvpo50nn.R.inc(529);expectedCharMap32.add(Arrays.asList('#',' ','*',' ',' ','#'));
        __CLR4_3_1agagjvpo50nn.R.inc(530);expectedCharMap32.add(Arrays.asList('#','#','#','#','#','#'));

        __CLR4_3_1agagjvpo50nn.R.inc(531);expectedCharMap41 = new ArrayList<>();
        __CLR4_3_1agagjvpo50nn.R.inc(532);expectedCharMap41.add(Arrays.asList('#','#','#','#','#','#'));
        __CLR4_3_1agagjvpo50nn.R.inc(533);expectedCharMap41.add(Arrays.asList('#',' ','.',' ',' ','#'));
        __CLR4_3_1agagjvpo50nn.R.inc(534);expectedCharMap41.add(Arrays.asList('#',' ','.','@','$','#'));
        __CLR4_3_1agagjvpo50nn.R.inc(535);expectedCharMap41.add(Arrays.asList('#',' ','*',' ',' ','#'));
        __CLR4_3_1agagjvpo50nn.R.inc(536);expectedCharMap41.add(Arrays.asList('#',' ',' ',' ',' ','#'));
        __CLR4_3_1agagjvpo50nn.R.inc(537);expectedCharMap41.add(Arrays.asList('#','#','#','#','#','#'));

        __CLR4_3_1agagjvpo50nn.R.inc(538);expectedCharMap42 = new ArrayList<>();
        __CLR4_3_1agagjvpo50nn.R.inc(539);expectedCharMap42.add(Arrays.asList('#','#','#','#','#','#'));
        __CLR4_3_1agagjvpo50nn.R.inc(540);expectedCharMap42.add(Arrays.asList('#',' ','.',' ',' ','#'));
        __CLR4_3_1agagjvpo50nn.R.inc(541);expectedCharMap42.add(Arrays.asList('#',' ','.','@','*','#'));
        __CLR4_3_1agagjvpo50nn.R.inc(542);expectedCharMap42.add(Arrays.asList('#',' ','*',' ',' ','#'));
        __CLR4_3_1agagjvpo50nn.R.inc(543);expectedCharMap42.add(Arrays.asList('#',' ','.',' ',' ','#'));
        __CLR4_3_1agagjvpo50nn.R.inc(544);expectedCharMap42.add(Arrays.asList('#','#','#','#','#','#'));

        __CLR4_3_1agagjvpo50nn.R.inc(545);testCharMap1 = new ArrayList<>();
        __CLR4_3_1agagjvpo50nn.R.inc(546);testCharMap1.add(Arrays.asList('#','#','#','#','#','#'));
        __CLR4_3_1agagjvpo50nn.R.inc(547);testCharMap1.add(Arrays.asList('#',' ','.',' ',' ','#'));
        __CLR4_3_1agagjvpo50nn.R.inc(548);testCharMap1.add(Arrays.asList('#',' ','+','$',' ','#'));
        __CLR4_3_1agagjvpo50nn.R.inc(549);testCharMap1.add(Arrays.asList('#',' ','*',' ',' ','#'));
        __CLR4_3_1agagjvpo50nn.R.inc(550);testCharMap1.add(Arrays.asList('#',' ',' ',' ',' ','#'));
        __CLR4_3_1agagjvpo50nn.R.inc(551);testCharMap1.add(Arrays.asList('#','#','#','#','#','#'));
        __CLR4_3_1agagjvpo50nn.R.inc(552);testLevel.setCharMap(testCharMap1);
        __CLR4_3_1agagjvpo50nn.R.inc(553);testLevel.setPlayerPosition(new Position(2,3));
        __CLR4_3_1agagjvpo50nn.R.inc(554);testLevel.move(-1,0);
        __CLR4_3_1agagjvpo50nn.R.inc(555);assertEquals(testLevel.getCharMap(), expectedCharMap1);

        __CLR4_3_1agagjvpo50nn.R.inc(556);testCharMap1 = new ArrayList<>();
        __CLR4_3_1agagjvpo50nn.R.inc(557);testCharMap1.add(Arrays.asList('#','#','#','#','#','#'));
        __CLR4_3_1agagjvpo50nn.R.inc(558);testCharMap1.add(Arrays.asList('#',' ','.',' ',' ','#'));
        __CLR4_3_1agagjvpo50nn.R.inc(559);testCharMap1.add(Arrays.asList('#',' ','+','$',' ','#'));
        __CLR4_3_1agagjvpo50nn.R.inc(560);testCharMap1.add(Arrays.asList('#',' ','*',' ',' ','#'));
        __CLR4_3_1agagjvpo50nn.R.inc(561);testCharMap1.add(Arrays.asList('#',' ',' ',' ',' ','#'));
        __CLR4_3_1agagjvpo50nn.R.inc(562);testCharMap1.add(Arrays.asList('#','#','#','#','#','#'));
        __CLR4_3_1agagjvpo50nn.R.inc(563);testLevel.setCharMap(testCharMap1);
        __CLR4_3_1agagjvpo50nn.R.inc(564);testLevel.setPlayerPosition(new Position(2,3));
        __CLR4_3_1agagjvpo50nn.R.inc(565);testLevel.move(0,-1);
        __CLR4_3_1agagjvpo50nn.R.inc(566);assertEquals(testLevel.getCharMap(), expectedCharMap2);

        __CLR4_3_1agagjvpo50nn.R.inc(567);testCharMap1 = new ArrayList<>();
        __CLR4_3_1agagjvpo50nn.R.inc(568);testCharMap1.add(Arrays.asList('#','#','#','#','#','#'));
        __CLR4_3_1agagjvpo50nn.R.inc(569);testCharMap1.add(Arrays.asList('#',' ','.',' ',' ','#'));
        __CLR4_3_1agagjvpo50nn.R.inc(570);testCharMap1.add(Arrays.asList('#',' ','+','$',' ','#'));
        __CLR4_3_1agagjvpo50nn.R.inc(571);testCharMap1.add(Arrays.asList('#',' ','*',' ',' ','#'));
        __CLR4_3_1agagjvpo50nn.R.inc(572);testCharMap1.add(Arrays.asList('#',' ',' ',' ',' ','#'));
        __CLR4_3_1agagjvpo50nn.R.inc(573);testCharMap1.add(Arrays.asList('#','#','#','#','#','#'));
        __CLR4_3_1agagjvpo50nn.R.inc(574);testLevel.setCharMap(testCharMap1);
        __CLR4_3_1agagjvpo50nn.R.inc(575);testLevel.setPlayerPosition(new Position(2,3));
        __CLR4_3_1agagjvpo50nn.R.inc(576);testLevel.move(1,0);
        __CLR4_3_1agagjvpo50nn.R.inc(577);assertEquals(testLevel.getCharMap(), expectedCharMap31);

        __CLR4_3_1agagjvpo50nn.R.inc(578);testCharMap2 = new ArrayList<>();
        __CLR4_3_1agagjvpo50nn.R.inc(579);testCharMap2.add(Arrays.asList('#','#','#','#','#','#'));
        __CLR4_3_1agagjvpo50nn.R.inc(580);testCharMap2.add(Arrays.asList('#',' ','.',' ',' ','#'));
        __CLR4_3_1agagjvpo50nn.R.inc(581);testCharMap2.add(Arrays.asList('#',' ','+','$','.','#'));
        __CLR4_3_1agagjvpo50nn.R.inc(582);testCharMap2.add(Arrays.asList('#',' ','*',' ',' ','#'));
        __CLR4_3_1agagjvpo50nn.R.inc(583);testCharMap2.add(Arrays.asList('#',' ','.',' ',' ','#'));
        __CLR4_3_1agagjvpo50nn.R.inc(584);testCharMap2.add(Arrays.asList('#','#','#','#','#','#'));
        __CLR4_3_1agagjvpo50nn.R.inc(585);testLevel.setCharMap(testCharMap2);
        __CLR4_3_1agagjvpo50nn.R.inc(586);testLevel.setPlayerPosition(new Position(2,3));
        __CLR4_3_1agagjvpo50nn.R.inc(587);testLevel.move(1,0);
        __CLR4_3_1agagjvpo50nn.R.inc(588);assertEquals(testLevel.getCharMap(), expectedCharMap32);

        __CLR4_3_1agagjvpo50nn.R.inc(589);testCharMap1 = new ArrayList<>();
        __CLR4_3_1agagjvpo50nn.R.inc(590);testCharMap1.add(Arrays.asList('#','#','#','#','#','#'));
        __CLR4_3_1agagjvpo50nn.R.inc(591);testCharMap1.add(Arrays.asList('#',' ','.',' ',' ','#'));
        __CLR4_3_1agagjvpo50nn.R.inc(592);testCharMap1.add(Arrays.asList('#',' ','+','$',' ','#'));
        __CLR4_3_1agagjvpo50nn.R.inc(593);testCharMap1.add(Arrays.asList('#',' ','*',' ',' ','#'));
        __CLR4_3_1agagjvpo50nn.R.inc(594);testCharMap1.add(Arrays.asList('#',' ',' ',' ',' ','#'));
        __CLR4_3_1agagjvpo50nn.R.inc(595);testCharMap1.add(Arrays.asList('#','#','#','#','#','#'));
        __CLR4_3_1agagjvpo50nn.R.inc(596);testLevel.setCharMap(testCharMap1);
        __CLR4_3_1agagjvpo50nn.R.inc(597);testLevel.setPlayerPosition(new Position(2,3));
        __CLR4_3_1agagjvpo50nn.R.inc(598);testLevel.move(0,1);
        __CLR4_3_1agagjvpo50nn.R.inc(599);assertEquals(testLevel.getCharMap(), expectedCharMap41);

        __CLR4_3_1agagjvpo50nn.R.inc(600);testCharMap2 = new ArrayList<>();
        __CLR4_3_1agagjvpo50nn.R.inc(601);testCharMap2.add(Arrays.asList('#','#','#','#','#','#'));
        __CLR4_3_1agagjvpo50nn.R.inc(602);testCharMap2.add(Arrays.asList('#',' ','.',' ',' ','#'));
        __CLR4_3_1agagjvpo50nn.R.inc(603);testCharMap2.add(Arrays.asList('#',' ','+','$','.','#'));
        __CLR4_3_1agagjvpo50nn.R.inc(604);testCharMap2.add(Arrays.asList('#',' ','*',' ',' ','#'));
        __CLR4_3_1agagjvpo50nn.R.inc(605);testCharMap2.add(Arrays.asList('#',' ','.',' ',' ','#'));
        __CLR4_3_1agagjvpo50nn.R.inc(606);testCharMap2.add(Arrays.asList('#','#','#','#','#','#'));
        __CLR4_3_1agagjvpo50nn.R.inc(607);testLevel.setCharMap(testCharMap2);
        __CLR4_3_1agagjvpo50nn.R.inc(608);testLevel.setPlayerPosition(new Position(2,3));
        __CLR4_3_1agagjvpo50nn.R.inc(609);testLevel.move(0,1);
        __CLR4_3_1agagjvpo50nn.R.inc(610);assertEquals(testLevel.getCharMap(), expectedCharMap42);
    }finally{__CLR4_3_1agagjvpo50nn.R.flushNeeded();}}

    @Test
    void isLevelOver() {try{__CLR4_3_1agagjvpo50nn.R.inc(611);
        __CLR4_3_1agagjvpo50nn.R.inc(612);List<List<Character>> testCharMap = new ArrayList<>();
        __CLR4_3_1agagjvpo50nn.R.inc(613);testCharMap.add(Arrays.asList('#','#','#','#','#','#'));
        __CLR4_3_1agagjvpo50nn.R.inc(614);testCharMap.add(Arrays.asList('#',' ',' ',' ',' ','#'));
        __CLR4_3_1agagjvpo50nn.R.inc(615);testCharMap.add(Arrays.asList('#',' ','@','$',' ','#'));
        __CLR4_3_1agagjvpo50nn.R.inc(616);testCharMap.add(Arrays.asList('#',' ','*',' ',' ','#'));
        __CLR4_3_1agagjvpo50nn.R.inc(617);testCharMap.add(Arrays.asList('#',' ',' ',' ',' ','#'));
        __CLR4_3_1agagjvpo50nn.R.inc(618);testCharMap.add(Arrays.asList('#','#','#','#','#','#'));

        __CLR4_3_1agagjvpo50nn.R.inc(619);Level testLevel = new Level();
        __CLR4_3_1agagjvpo50nn.R.inc(620);testLevel.setCharMap(testCharMap);
        __CLR4_3_1agagjvpo50nn.R.inc(621);assertTrue(testLevel.isLevelOver());
    }finally{__CLR4_3_1agagjvpo50nn.R.flushNeeded();}}

    @Test
    void deletCharMap() {try{__CLR4_3_1agagjvpo50nn.R.inc(622);
        __CLR4_3_1agagjvpo50nn.R.inc(623);List<List<Character>> testCharMap = new ArrayList<>();
        __CLR4_3_1agagjvpo50nn.R.inc(624);testCharMap.add(Arrays.asList('#','#','#','#','#','#'));
        __CLR4_3_1agagjvpo50nn.R.inc(625);testCharMap.add(Arrays.asList('#',' ',' ',' ',' ','#'));
        __CLR4_3_1agagjvpo50nn.R.inc(626);testCharMap.add(Arrays.asList('#',' ','@','$',' ','#'));
        __CLR4_3_1agagjvpo50nn.R.inc(627);testCharMap.add(Arrays.asList('#',' ','*',' ',' ','#'));
        __CLR4_3_1agagjvpo50nn.R.inc(628);testCharMap.add(Arrays.asList('#',' ',' ',' ',' ','#'));
        __CLR4_3_1agagjvpo50nn.R.inc(629);testCharMap.add(Arrays.asList('#','#','#','#','#','#'));

        __CLR4_3_1agagjvpo50nn.R.inc(630);Level testLevel = new Level();
        __CLR4_3_1agagjvpo50nn.R.inc(631);testLevel.setCharMap(testCharMap);
        __CLR4_3_1agagjvpo50nn.R.inc(632);testLevel.deleteCharMap();
        __CLR4_3_1agagjvpo50nn.R.inc(633);assertNull(testLevel.getCharMap());
    }finally{__CLR4_3_1agagjvpo50nn.R.flushNeeded();}}

    @Test
    void addStep() {try{__CLR4_3_1agagjvpo50nn.R.inc(634);
        __CLR4_3_1agagjvpo50nn.R.inc(635);Level testLevel = new Level();
        __CLR4_3_1agagjvpo50nn.R.inc(636);testLevel.setStep(0);
        __CLR4_3_1agagjvpo50nn.R.inc(637);testLevel.addStep();
        __CLR4_3_1agagjvpo50nn.R.inc(638);assertEquals(testLevel.getStep(), 1);
    }finally{__CLR4_3_1agagjvpo50nn.R.flushNeeded();}}

    @Test
    void getStepToString() {try{__CLR4_3_1agagjvpo50nn.R.inc(639);
        __CLR4_3_1agagjvpo50nn.R.inc(640);Level testLevel = new Level();
        __CLR4_3_1agagjvpo50nn.R.inc(641);testLevel.setStep(51);
        __CLR4_3_1agagjvpo50nn.R.inc(642);assertEquals(testLevel.getStepToString(), "51");
    }finally{__CLR4_3_1agagjvpo50nn.R.flushNeeded();}}
}