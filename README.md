ee7
===

** First **

1. ```mvn archetype:generate```
2. ```750: remote -> org.jboss.spec.archetypes:jboss-javaee6-ear-webapp```
3. Increase PermGen space. It is used by the container for the *permanent generation*. After every reload of the .EAR, the PermGen space is increased. 
```-XX:PermSize=128m```





References:

Cool QuickStart for JSF application:
http://www.jboss.org/jdf/quickstarts/jboss-as-quickstart/guide/GreeterQuickstart/