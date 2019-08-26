<org.uberfire.java.nio.base.Properties serialization="custom">
  <unserializable-parents/>
  <map>
    <default>
      <loadFactor>0.75</loadFactor>
      <threshold>12</threshold>
    </default>
    <int>16</int>
    <int>1</int>
    <string>dcore.description[0]</string>
    <string>CREATE TABLE TRAFODION.UDEMO.FOODCONTAINER
(

      CURRENTDATE                      TIMESTAMP(6) DEFAULT NULL NOT SERIALIZED, 

      RFID                             CHAR(50) CHARACTER SET ISO88591 COLLATE DEFAULT DEFAULT NULL NOT SERIALIZED, 

      RFIDTYPE                         CHAR(20) CHARACTER SET ISO88591 COLLATE DEFAULT DEFAULT NULL NOT SERIALIZED,

      SLOTNO                           INT DEFAULT NULL NOT SERIALIZED,

      FOODSTATUS                       INT DEFAULT NULL NOT SERIALIZED,

      ORGCODE                          CHAR(4) CHARACTER SET ISO88591 COLLATE DEFAULT DEFAULT NULL NOT SERIALIZED,

      DEPTCODE                         CHAR(20) CHARACTER SET ISO88591 COLLATE DEFAULT DEFAULT NULL NOT SERIALIZED, 

      EQUIPCODE                        CHAR(20) CHARACTER SET ISO88591 COLLATE DEFAULT DEFAULT NULL NOT SERIALIZED,

      EQUIPCODEINSTANCE                CHAR(20) CHARACTER SET ISO88591 COLLATE DEFAULT DEFAULT NULL NOT SERIALIZED,

      WORKORDERNO                      CHAR(20) CHARACTER SET ISO88591 COLLATE DEFAULT DEFAULT NULL NOT SERIALIZED,

      OPERATIONSEQ                     INT DEFAULT NULL NOT SERIALIZED,

      ACTIVITY                         CHAR(20) CHARACTER SET ISO88591 COLLATE DEFAULT DEFAULT NULL NOT SERIALIZED, 

      SERIALNO                         CHAR(20) CHARACTER SET ISO88591 COLLATE DEFAULT DEFAULT NULL NOT SERIALIZED, 

      CONTEXTTYPE                      INT DEFAULT NULL NOT SERIALIZED

)

ATTRIBUTES ALIGNED FORMAT NAMESPACE &apos;TRAF_1500000&apos;;</string>
  </map>
</org.uberfire.java.nio.base.Properties>