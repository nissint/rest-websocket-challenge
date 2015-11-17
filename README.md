
A challenge to create a web page that sends a string to a back end using a RESTful interface
then prints the string to the page with the string coming through a Websocket.

This implementation will be using Java and AngularJS.

Developed and Tested with:
	* Linux 2.6.32-504.16.2.el6.x86_64
	* CentOS 6.6 Release 
	* Java 1.7.0_75
	* Maven 3.3.3
	* Tomcat 8.0.23

Java Dependencies:
	* org.springframework:spring-core:jar:4.0.6.RELEASE:compile
	* org.glassfish.jersey.containers:jersey-container-servlet-core:jar:2.12:compile
	* org.eclipse.jetty:jetty-io:jar:9.1.1.v20140108:compile
	* org.eclipse.jetty:jetty-webapp:jar:9.1.1.v20140108:compile
	* org.glassfish.hk2:hk2-api:jar:2.3.0-b10:compile
	* org.springframework:spring-web:jar:4.0.6.RELEASE:compile
	* org.javassist:javassist:jar:3.18.1-GA:compile
	* org.eclipse.jetty:jetty-util:jar:9.1.1.v20140108:compile
	* org.eclipse.jetty:jetty-continuation:jar:9.1.1.v20140108:compile
	* javax.validation:validation-api:jar:1.1.0.Final:compile
	* org.eclipse.jetty:jetty-security:jar:9.1.1.v20140108:compile
	* org.glassfish.jersey.containers:jersey-container-jetty-http:jar:2.12:compile
	* org.glassfish.jersey.core:jersey-client:jar:2.12:compile
	* org.eclipse.jetty:jetty-http:jar:9.1.1.v20140108:compile
	* org.glassfish.hk2:osgi-resource-locator:jar:1.0.1:compile
	* org.springframework:spring-expression:jar:4.0.6.RELEASE:compile
	* org.springframework:spring-aop:jar:4.0.6.RELEASE:compile
	* org.springframework:spring-beans:jar:4.0.6.RELEASE:compile
	* org.glassfish.jersey.core:jersey-common:jar:2.12:compile
	* org.glassfish.jersey.core:jersey-server:jar:2.12:compile
	* org.glassfish.hk2:hk2-locator:jar:2.3.0-b10:compile
	* javax.websocket:javax.websocket-api:jar:1.1:compile
	* javax.servlet:javax.servlet-api:jar:3.1.0:compile
	* org.eclipse.jetty:jetty-xml:jar:9.1.1.v20140108:compile
	* org.eclipse.jetty:jetty-servlet:jar:9.1.1.v20140108:compile
	* org.glassfish.jersey.containers:jersey-container-servlet:jar:2.12:compile
	* org.springframework:spring-context:jar:4.0.6.RELEASE:compile
	* commons-logging:commons-logging:jar:1.1.3:compile
	* org.glassfish.jersey.containers:jersey-container-jetty-servlet:jar:2.12:compile
	* org.glassfish.hk2:hk2-utils:jar:2.3.0-b10:compile
	* aopalliance:aopalliance:jar:1.0:compile
	* org.glassfish.hk2.external:javax.inject:jar:2.3.0-b10:compile
	* org.eclipse.jetty:jetty-server:jar:9.1.1.v20140108:compile
	* org.glassfish.jersey.bundles.repackaged:jersey-guava:jar:2.12:compile
	* org.glassfish.hk2.external:aopalliance-repackaged:jar:2.3.0-b10:compile
	* javax.annotation:javax.annotation-api:jar:1.2:compile
	* javax.ws.rs:javax.ws.rs-api:jar:2.0.1:compile

Javascript Dependencies:
	* AngularJS v1.4.7
