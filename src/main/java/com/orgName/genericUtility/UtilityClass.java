//package com.orgName.genericUtility;
//
//import javax.naming.ldap.ExtendedRequest;
//
//import org.apache.poi.hssf.record.common.UnicodeString.ExtRst;
//import org.openqa.selenium.WebDriver;
//
//public class UtilityClass {
//
//	private static ThreadLocal<ExtRst> testTL=new ThreadLocal<ExtRst>();
//	private static ThreadLocal<WebDriver> driverTL=new ThreadLocal<WebDriver>();
//	private static ThreadLocal<ExcelLibrary> ExcelLibraryTL=new ThreadLocal<ExcelLibrary>();
//	private static ThreadLocal<JavaLibrary> JavaLibraryTL=new ThreadLocal<JavaLibrary>();
////	private static ThreadLocal<SeleniumActions> SeleniumActionsTL=new ThreadLocal<SeleniumActions>();
//	private static ThreadLocal<Integer> randomNumberTL=new ThreadLocal<Integer>();
//	private static ThreadLocal<Long> timeoutTL=new ThreadLocal<Long>();
//
//
//	public static ExtendedRequest getTest() {
//		return (ExtendedRequest) testTL.get();
//	}
//	public static WebDriver getDriver() {
//		return driverTL.get();
//	}
//
//	public static ExcelLibrary getExcelLibrary() {
//		return ExcelLibraryTL.get();
//	}
//	public static JavaLibrary getJavaLibrary() {
//		return JavaLibraryTL.get();
//	}
////	public static SeleniumActions getSeleniumActions() {
////		return SeleniumActionsTL.get();
////	}
//	public static int getRandomNumber() {
//		return randomNumberTL.get();
//	}
//	public static long getTimeout() {
//		return timeoutTL.get();
//	}
//
//	public static void setDriver(WebDriver driver) {
//		driverTL.set(driver);
//	}
//	public static void setExcelLibrary(ExcelLibrary ExcelLibrary) {
//		ExcelLibraryTL.set(ExcelLibrary);
//	}
//	public static void setJavaLibrary(JavaLibrary JavaLibrary) {
//		JavaLibraryTL.set(JavaLibrary);
//	}
////	public static void setSeleniumActions(SeleniumActions SeleniumActions) {
//	//	SeleniumActionsTL.set(SeleniumActions);
////	}
//
//
//	public static void setTest(ExtendedRequest test) {
//		testTL.set((ExtRst) test);
//	}
//
//	public static void setRandomNumber(int randomNumber) {
//		randomNumberTL.set(randomNumber);
//	}
//
//	public static void setTimeout(long timeout) {
//		timeoutTL.set(timeout);
//	}
//}
