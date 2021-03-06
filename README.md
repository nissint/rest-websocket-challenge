
<h3>Rest-Websocket Challenge</h3>

<h4>Synopsys</h4>

<p>
	A challenge to create a web page that sends a string to a back end using a RESTful interface
	then prints the string to the page with the string coming through a Websocket.
</p>

<p>The task is to develop a web page with a button and a text box.  First, the user inputs a string into the text box and then clicks the button.</p>
<p>The button has a javascript handler set that sends the string to the backend app which takes the string and sends it back to the frontend through a websocket</p>
<p>The web page has a handler associated to the websocket and when it receives the string, it is printed put dynamically under the text box</p>
<p>The choice of backend framework to create RESTful endpoints and websockets is up to you; as it the choice of frontend framework.</p>
<p>Good Luck!</p>
	
<h4>Developed and Tested with:</h4>
<ul>
	<li>Linux 2.6.32-504.16.2.el6.x86_64</li>
	<li>CentOS 6.6 Release</li>
	<li>Java 1.7.0_75</li>
	<li>Maven 3.3.3</li>
	<li>Tomcat 8.0.23</li>
</ul>

<h4>Java Dependencies:</h4>
<ul>
	<li>org.springframework:spring-core:jar:4.0.6.RELEASE:compile</li>
	<li>org.glassfish.jersey.containers:jersey-container-servlet-core:jar:2.12:compile</li>
	<li>org.eclipse.jetty:jetty-io:jar:9.1.1.v20140108:compile</li>
	<li>org.eclipse.jetty:jetty-webapp:jar:9.1.1.v20140108:compile</li>
	<li>org.glassfish.hk2:hk2-api:jar:2.3.0-b10:compile</li>
	<li>org.springframework:spring-web:jar:4.0.6.RELEASE:compile</li>
	<li>org.javassist:javassist:jar:3.18.1-GA:compile</li>
	<li>org.eclipse.jetty:jetty-util:jar:9.1.1.v20140108:compile</li>
	<li>org.eclipse.jetty:jetty-continuation:jar:9.1.1.v20140108:compile</li>
	<li>javax.validation:validation-api:jar:1.1.0.Final:compile</li>
	<li>org.eclipse.jetty:jetty-security:jar:9.1.1.v20140108:compile</li>
	<li>org.glassfish.jersey.containers:jersey-container-jetty-http:jar:2.12:compile</li>
	<li>org.glassfish.jersey.core:jersey-client:jar:2.12:compile</li>
	<li>org.eclipse.jetty:jetty-http:jar:9.1.1.v20140108:compile</li>
	<li>org.glassfish.hk2:osgi-resource-locator:jar:1.0.1:compile</li>
	<li>org.springframework:spring-expression:jar:4.0.6.RELEASE:compile</li>
	<li>org.springframework:spring-aop:jar:4.0.6.RELEASE:compile</li>
	<li>org.springframework:spring-beans:jar:4.0.6.RELEASE:compile</li>
	<li>org.glassfish.jersey.core:jersey-common:jar:2.12:compile</li>
	<li>org.glassfish.jersey.core:jersey-server:jar:2.12:compile</li>
	<li>org.glassfish.hk2:hk2-locator:jar:2.3.0-b10:compile</li>
	<li>javax.websocket:javax.websocket-api:jar:1.1:compile</li>
	<li>javax.servlet:javax.servlet-api:jar:3.1.0:compile</li>
	<li>org.eclipse.jetty:jetty-xml:jar:9.1.1.v20140108:compile</li>
	<li>org.eclipse.jetty:jetty-servlet:jar:9.1.1.v20140108:compile</li>
	<li>org.glassfish.jersey.containers:jersey-container-servlet:jar:2.12:compile</li>
	<li>org.springframework:spring-context:jar:4.0.6.RELEASE:compile</li>
	<li>commons-logging:commons-logging:jar:1.1.3:compile</li>
	<li>org.glassfish.jersey.containers:jersey-container-jetty-servlet:jar:2.12:compile</li>
	<li>org.glassfish.hk2:hk2-utils:jar:2.3.0-b10:compile</li>
	<li>aopalliance:aopalliance:jar:1.0:compile</li>
	<li>org.glassfish.hk2.external:javax.inject:jar:2.3.0-b10:compile</li>
	<li>org.eclipse.jetty:jetty-server:jar:9.1.1.v20140108:compile</li>
	<li>org.glassfish.jersey.bundles.repackaged:jersey-guava:jar:2.12:compile</li>
	<li>org.glassfish.hk2.external:aopalliance-repackaged:jar:2.3.0-b10:compile</li>
	<li>javax.annotation:javax.annotation-api:jar:1.2:compile</li>
	<li>javax.ws.rs:javax.ws.rs-api:jar:2.0.1:compile</li>
</ul>

<h4>Javascript Dependencies:</h4>
<ul>
	<li>AngularJS v1.4.7</li>
</ul>
