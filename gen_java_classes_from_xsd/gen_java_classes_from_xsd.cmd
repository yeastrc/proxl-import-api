
REM  Windows .cmd file

REM  Uses JAXB RI  XJC program to generate Java classes from the xsd file.

REM  Use xjc from JDK.  It is a slightly older version in java 8 JDK but adequate

REM  May need path to JDK before 'xjc'

REM windows one-liner
REM Update filename at vX.X.X
REM xjc -d ..\src_java_jaxb_classes_from_xsd -p org.yeastrc.limelight.proxl_import.api.xml_dto ..\xsd/proxl-xml-vX.X.X.xsd


