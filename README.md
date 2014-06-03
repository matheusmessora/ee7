ee7
===

** First **

1. ```mvn archetype:generate```
2. ```750: remote -> org.jboss.spec.archetypes:jboss-javaee6-ear-webapp```
3. Increase PermGen space. It is used by the container for the *permanent generation*. After every reload of the .EAR, the PermGen space is increased. ```-XX:PermSize=128m```
4. JMS Support added in pom.xml
4.1. JBoss by default doesn't support Messaging. It must run with standalone-full.xml

References:

Cool QuickStart for JSF application:
http://www.jboss.org/jdf/quickstarts/jboss-as-quickstart/guide/GreeterQuickstart/

4.2. JMS creation: ```jms-queue count-messages --queue-address=testQueue```

5. INFINISPAN
5.1 ```<cache-container name="local" default-cache="matheus" start="EAGER">
                <local-cache name="matheus">
                </local-cache>
            </cache-container>```