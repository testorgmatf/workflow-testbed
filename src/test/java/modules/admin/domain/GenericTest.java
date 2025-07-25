package modules.admin.domain;

import static java.lang.Boolean.TRUE;

import org.junit.jupiter.api.Test;

import util.AbstractH2Test;

public class GenericTest extends AbstractH2Test {

    @Test
    public void testX() {

        Generic g = Generic.newInstance();

        g.setId1("id1");
        g.getId1();
        g.setId2("id2");
        g.getId2();
        g.setId3("id3");
        g.getId3();
        g.setId4("id4");
        g.getId4();
        g.setId5("id5");
        g.getId5();
        g.setId6("id6");
        g.getId6();
        g.setId7("id7");
        g.getId7();
        g.setId8("id8");
        g.getId8();
        g.setId9("id9");
        g.getId9();
        g.setId10("id10");
        g.getId10();

        g.setMemo1("memo1");
        g.getMemo1();
        g.setMemo2("memo2");
        g.getMemo2();
        g.setMemo3("memo3");
        g.getMemo3();
        g.setMemo4("memo4");
        g.getMemo4();
        g.setMemo5("memo5");
        g.getMemo5();
        g.setMemo6("memo6");
        g.getMemo6();
        g.setMemo7("memo7");
        g.getMemo7();
//        g.setMemo8("memo8");
//        g.getMemo8();
//        g.setMemo9("memo9");
//        g.getMemo9();
//        g.setMemo10("memo10");
//        g.getMemo10();

        g.setBoolean1(TRUE);
        g.getBoolean1();
        g.setBoolean2(Boolean.FALSE);
        g.getBoolean2();
        g.setBoolean3(Boolean.TRUE);
        g.getBoolean3();
        g.setBoolean4(Boolean.FALSE);
        g.getBoolean4();
        g.setBoolean5(Boolean.TRUE);
        g.getBoolean5();
        g.setBoolean6(Boolean.FALSE);
        g.getBoolean6();
        g.setBoolean7(Boolean.TRUE);
        g.getBoolean7();
        g.setBoolean8(Boolean.FALSE);
        g.getBoolean8();
        g.setBoolean9(Boolean.TRUE);
        g.getBoolean9();
        g.setBoolean10(Boolean.FALSE);
        g.getBoolean10();

        // DateOnly, DateTime, TimeOnly, Timestamp, Decimal2, Decimal5, Decimal10, Integer, Long, Geometry, Markup, Text
        // Use null for custom types, as we don't have their constructors
        g.setDate1(null);
        g.getDate1();
        g.setDate2(null);
        g.getDate2();
        g.setDate3(null);
        g.getDate3();
        g.setDate4(null);
        g.getDate4();
        g.setDate5(null);
        g.getDate5();
        g.setDate6(null);
        g.getDate6();
        g.setDate7(null);
        g.getDate7();
        g.setDate8(null);
        g.getDate8();
        g.setDate9(null);
        g.getDate9();
        g.setDate10(null);
        g.getDate10();

        g.setDateTime1(null);
        g.getDateTime1();
        g.setDateTime2(null);
        g.getDateTime2();
        g.setDateTime3(null);
        g.getDateTime3();
        g.setDateTime4(null);
        g.getDateTime4();
        g.setDateTime5(null);
        g.getDateTime5();
        g.setDateTime6(null);
        g.getDateTime6();
        g.setDateTime7(null);
        g.getDateTime7();
        g.setDateTime8(null);
        g.getDateTime8();
        g.setDateTime9(null);
        g.getDateTime9();
        g.setDateTime10(null);
        g.getDateTime10();

        g.setTime1(null);
        g.getTime1();
        g.setTime2(null);
        g.getTime2();
        g.setTime3(null);
        g.getTime3();
        g.setTime4(null);
        g.getTime4();
        g.setTime5(null);
        g.getTime5();
        g.setTime6(null);
        g.getTime6();
        g.setTime7(null);
        g.getTime7();
        g.setTime8(null);
        g.getTime8();
        g.setTime9(null);
        g.getTime9();
        g.setTime10(null);
        g.getTime10();

        g.setTimestamp1(null);
        g.getTimestamp1();
        g.setTimestamp2(null);
        g.getTimestamp2();
        g.setTimestamp3(null);
        g.getTimestamp3();
        g.setTimestamp4(null);
        g.getTimestamp4();
        g.setTimestamp5(null);
        g.getTimestamp5();
        g.setTimestamp6(null);
        g.getTimestamp6();
        g.setTimestamp7(null);
        g.getTimestamp7();
        g.setTimestamp8(null);
        g.getTimestamp8();
        g.setTimestamp9(null);
        g.getTimestamp9();
        g.setTimestamp10(null);
        g.getTimestamp10();

        g.setDecimal21(null);
        g.getDecimal21();
        g.setDecimal22(null);
        g.getDecimal22();
        g.setDecimal23(null);
        g.getDecimal23();
        g.setDecimal24(null);
        g.getDecimal24();
        g.setDecimal25(null);
        g.getDecimal25();
        g.setDecimal26(null);
        g.getDecimal26();
        g.setDecimal27(null);
        g.getDecimal27();
        g.setDecimal28(null);
        g.getDecimal28();
        g.setDecimal29(null);
        g.getDecimal29();
        g.setDecimal210(null);
        g.getDecimal210();

        g.setDecimal51(null);
        g.getDecimal51();
        g.setDecimal52(null);
        g.getDecimal52();
        g.setDecimal53(null);
        g.getDecimal53();
        g.setDecimal54(null);
        g.getDecimal54();
        g.setDecimal55(null);
        g.getDecimal55();
        g.setDecimal56(null);
        g.getDecimal56();
        g.setDecimal57(null);
        g.getDecimal57();
        g.setDecimal58(null);
        g.getDecimal58();
        g.setDecimal59(null);
        g.getDecimal59();
        g.setDecimal510(null);
        g.getDecimal510();

        g.setDecimal101(null);
        g.getDecimal101();
        g.setDecimal102(null);
        g.getDecimal102();
        g.setDecimal103(null);
        g.getDecimal103();
        g.setDecimal104(null);
        g.getDecimal104();
        g.setDecimal105(null);
        g.getDecimal105();
        g.setDecimal106(null);
        g.getDecimal106();
        g.setDecimal107(null);
        g.getDecimal107();
        g.setDecimal108(null);
        g.getDecimal108();
        g.setDecimal109(null);
        g.getDecimal109();
        g.setDecimal1010(null);
        g.getDecimal1010();

        g.setInteger1(1);
        g.getInteger1();
        g.setInteger2(2);
        g.getInteger2();
        g.setInteger3(3);
        g.getInteger3();
        g.setInteger4(4);
        g.getInteger4();
        g.setInteger5(5);
        g.getInteger5();
        g.setInteger6(6);
        g.getInteger6();
        g.setInteger7(7);
        g.getInteger7();
        g.setInteger8(8);
        g.getInteger8();
        g.setInteger9(9);
        g.getInteger9();
        g.setInteger10(10);
        g.getInteger10();

        g.setLongInteger1(1L);
        g.getLongInteger1();
        g.setLongInteger2(2L);
        g.getLongInteger2();
        g.setLongInteger3(3L);
        g.getLongInteger3();
        g.setLongInteger4(4L);
        g.getLongInteger4();
        g.setLongInteger5(5L);
        g.getLongInteger5();
        g.setLongInteger6(6L);
        g.getLongInteger6();
        g.setLongInteger7(7L);
        g.getLongInteger7();
        g.setLongInteger8(8L);
        g.getLongInteger8();
        g.setLongInteger9(9L);
        g.getLongInteger9();
        g.setLongInteger10(10L);
        g.getLongInteger10();

        g.setGeometry1(null);
        g.getGeometry1();
        g.setGeometry2(null);
        g.getGeometry2();
        g.setGeometry3(null);
        g.getGeometry3();
        g.setGeometry4(null);
        g.getGeometry4();
        g.setGeometry5(null);
        g.getGeometry5();
        g.setGeometry6(null);
        g.getGeometry6();
        g.setGeometry7(null);
        g.getGeometry7();
        g.setGeometry8(null);
        g.getGeometry8();
        g.setGeometry9(null);
        g.getGeometry9();
        g.setGeometry10(null);
        g.getGeometry10();

        g.setMarkup1(null);
        g.getMarkup1();
        g.setMarkup2(null);
        g.getMarkup2();
        g.setMarkup3(null);
        g.getMarkup3();
        g.setMarkup4(null);
        g.getMarkup4();
        g.setMarkup5(null);
        g.getMarkup5();
        g.setMarkup6(null);
        g.getMarkup6();
        g.setMarkup7(null);
        g.getMarkup7();
        g.setMarkup8(null);
        g.getMarkup8();
        g.setMarkup9(null);
        g.getMarkup9();
        g.setMarkup10(null);
        g.getMarkup10();

        g.setText5001("text1");
        g.getText5001();
        g.setText5002("text2");
        g.getText5002();
        g.setText5003("text3");
        g.getText5003();
        g.setText5004("text4");
        g.getText5004();
        g.setText5005("text5");
        g.getText5005();
        g.setText5006("text6");
        g.getText5006();
        g.setText5007("text7");
        g.getText5007();
        g.setText5008("text8");
        g.getText5008();
        g.setText5009("text9");
        g.getText5009();
        g.setText50010("text10");
        g.getText50010();
        
        g.setBizParentId("xyz");
        g.getBizParentId();
    }
}
