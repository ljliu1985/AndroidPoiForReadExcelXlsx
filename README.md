#-------20180824

基于注解导入和导出excel，RxJava处理，包含进度信息，生成对象，数据校验，支持U盘导入导出。
https://github.com/ljliu1985/rxpoireadexcelxlsx

#-------


#Android PoiReadExcelXlsx
使用Poi读取高版本Excel xlsx文件， 
这里主要是rt.jar包解决了以下两个错误：
   java.lang.NoClassDefFoundError: Failed resolution of: Ljavax/xml/stream/XMLEventFactory;
        at org.apache.poi.openxml4j.opc.internal.marshallers.PackagePropertiesMarshaller.<clinit>(PackagePropertiesMarshaller.java:41)
        at org.apache.poi.openxml4j.opc.OPCPackage.init(OPCPackage.java:161)
        at org.apache.poi.openxml4j.opc.OPCPackage.<init>(OPCPackage.java:141)
        at org.apache.poi.openxml4j.opc.ZipPackage.<init>(ZipPackage.java:97)
        at org.apache.poi.openxml4j.opc.OPCPackage.open(OPCPackage.java:324)
        at org.apache.poi.ss.usermodel.WorkbookFactory.create(WorkbookFactory.java:184)
        at org.apache.poi.ss.usermodel.WorkbookFactory.create(WorkbookFactory.java:149)
		
		
		


javax.xml.stream.FactoryConfigurationError: Provider com.sun.xml.internal.stream.events.XMLEventFactoryImpl not found
        at javax.xml.stream.FactoryFinder.newInstance(Unknown Source)
        at javax.xml.stream.FactoryFinder.newInstance(Unknown Source)
        at javax.xml.stream.FactoryFinder.find(Unknown Source)
        at javax.xml.stream.FactoryFinder.find(Unknown Source)
        at javax.xml.stream.XMLEventFactory.newInstance(Unknown Source)
        at org.apache.poi.openxml4j.opc.internal.marshallers.PackagePropertiesMarshaller.<clinit>(PackagePropertiesMarshaller.java:41)
        at org.apache.poi.openxml4j.opc.OPCPackage.init(OPCPackage.java:161)
        at org.apache.poi.openxml4j.opc.OPCPackage.<init>(OPCPackage.java:141)
        at org.apache.poi.openxml4j.opc.ZipPackage.<init>(ZipPackage.java:97)
        at org.apache.poi.openxml4j.opc.OPCPackage.open(OPCPackage.java:324)
        at org.apache.poi.ss.usermodel.WorkbookFactory.create(WorkbookFactory.java:184)
        at org.apache.poi.ss.usermodel.WorkbookFactory.create(WorkbookFactory.java:149)	
	

