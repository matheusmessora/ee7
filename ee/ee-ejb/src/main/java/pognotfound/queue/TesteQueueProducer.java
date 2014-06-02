package pognotfound.queue;


import javax.annotation.Resource;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.jms.JMSContext;
import javax.jms.Queue;
import java.util.logging.Logger;


@Stateless
public class TesteQueueProducer {

    @Inject
    private Logger log;

    @Resource(mappedName = "java:jboss/exported/jms/queue/testQueue")
    private Queue queue;

    @Inject
    JMSContext context;

    public void produz() throws Exception {
        log.info(queue.getQueueName());
        for (int i = 0; i < 1000; i++) {
            context.createProducer().send(queue, "[\n" +
                    "    {\n" +
                    "        \"id\": 0,\n" +
                    "        \"guid\": \"f3a8401c-e2e2-4909-92ac-f1920fc878df\",\n" +
                    "        \"isActive\": false,\n" +
                    "        \"balance\": \"$3,313.88\",\n" +
                    "        \"picture\": \"http://placehold.it/32x32\",\n" +
                    "        \"age\": 34,\n" +
                    "        \"eyeColor\": \"green\",\n" +
                    "        \"name\": \"Montgomery Levy\",\n" +
                    "        \"gender\": \"male\",\n" +
                    "        \"company\": \"RODEOCEAN\",\n" +
                    "        \"email\": \"montgomerylevy@rodeocean.com\",\n" +
                    "        \"phone\": \"+1 (965) 587-3847\",\n" +
                    "        \"address\": \"106 Elliott Place, Foxworth, Maryland, 2452\",\n" +
                    "        \"about\": \"Id esse culpa ullamco excepteur. Reprehenderit nostrud non minim consectetur enim amet consectetur ex cupidatat. Do id ipsum amet non irure minim velit enim esse cupidatat amet cupidatat proident. Quis anim commodo consequat eu aliquip deserunt nulla amet. Duis laboris elit ea commodo officia veniam commodo excepteur mollit exercitation dolore officia officia laboris. Id elit eiusmod duis ex dolor fugiat est. Adipisicing elit elit eiusmod voluptate amet.\\r\\n\",\n" +
                    "        \"registered\": \"2014-01-13T06:20:55 +02:00\",\n" +
                    "        \"latitude\": -76.435889,\n" +
                    "        \"longitude\": 127.641066,\n" +
                    "        \"tags\": [\n" +
                    "            \"dolore\",\n" +
                    "            \"aute\",\n" +
                    "            \"excepteur\",\n" +
                    "            \"esse\",\n" +
                    "            \"culpa\",\n" +
                    "            \"laboris\",\n" +
                    "            \"anim\"\n" +
                    "        ],\n" +
                    "        \"friends\": [\n" +
                    "            {\n" +
                    "                \"id\": 0,\n" +
                    "                \"name\": \"Morris Mcintosh\"\n" +
                    "            },\n" +
                    "            {\n" +
                    "                \"id\": 1,\n" +
                    "                \"name\": \"Rowe Wilson\"\n" +
                    "            },\n" +
                    "            {\n" +
                    "                \"id\": 2,\n" +
                    "                \"name\": \"Savage Rios\"\n" +
                    "            }\n" +
                    "        ],\n" +
                    "        \"greeting\": \"Hello, Montgomery Levy! You have 6 unread messages.\",\n" +
                    "        \"favoriteFruit\": \"banana\"\n" +
                    "    },\n" +
                    "    {\n" +
                    "        \"id\": 1,\n" +
                    "        \"guid\": \"46075a42-5bff-4dc0-99bc-db249b68d0e2\",\n" +
                    "        \"isActive\": false,\n" +
                    "        \"balance\": \"$3,255.03\",\n" +
                    "        \"picture\": \"http://placehold.it/32x32\",\n" +
                    "        \"age\": 24,\n" +
                    "        \"eyeColor\": \"green\",\n" +
                    "        \"name\": \"Rowena Sweeney\",\n" +
                    "        \"gender\": \"female\",\n" +
                    "        \"company\": \"GEEKOLOGY\",\n" +
                    "        \"email\": \"rowenasweeney@geekology.com\",\n" +
                    "        \"phone\": \"+1 (908) 524-2787\",\n" +
                    "        \"address\": \"827 Amersfort Place, Lund, Maine, 5478\",\n" +
                    "        \"about\": \"Laborum amet ea in Lorem elit nulla aliquip dolore fugiat. Ea commodo duis esse cillum non do sit nulla eiusmod voluptate pariatur nostrud laborum. Anim cillum reprehenderit culpa minim nisi velit esse fugiat. Sint aute mollit duis consequat consequat ea officia cupidatat sunt non. Aute exercitation laborum esse reprehenderit qui ipsum ullamco.\\r\\n\",\n" +
                    "        \"registered\": \"2014-05-12T20:30:00 +03:00\",\n" +
                    "        \"latitude\": -64.543568,\n" +
                    "        \"longitude\": -43.170653,\n" +
                    "        \"tags\": [\n" +
                    "            \"dolore\",\n" +
                    "            \"nulla\",\n" +
                    "            \"excepteur\",\n" +
                    "            \"cupidatat\",\n" +
                    "            \"ex\",\n" +
                    "            \"irure\",\n" +
                    "            \"aute\"\n" +
                    "        ],\n" +
                    "        \"friends\": [\n" +
                    "            {\n" +
                    "                \"id\": 0,\n" +
                    "                \"name\": \"Sloan Irwin\"\n" +
                    "            },\n" +
                    "            {\n" +
                    "                \"id\": 1,\n" +
                    "                \"name\": \"Castro Boyle\"\n" +
                    "            },\n" +
                    "            {\n" +
                    "                \"id\": 2,\n" +
                    "                \"name\": \"Branch Payne\"\n" +
                    "            }\n" +
                    "        ],\n" +
                    "        \"greeting\": \"Hello, Rowena Sweeney! You have 6 unread messages.\",\n" +
                    "        \"favoriteFruit\": \"apple\"\n" +
                    "    },\n" +
                    "    {\n" +
                    "        \"id\": 2,\n" +
                    "        \"guid\": \"2ba94204-d493-43d6-a04f-24f1ce165d12\",\n" +
                    "        \"isActive\": true,\n" +
                    "        \"balance\": \"$2,826.82\",\n" +
                    "        \"picture\": \"http://placehold.it/32x32\",\n" +
                    "        \"age\": 24,\n" +
                    "        \"eyeColor\": \"green\",\n" +
                    "        \"name\": \"Sheree David\",\n" +
                    "        \"gender\": \"female\",\n" +
                    "        \"company\": \"ORBIXTAR\",\n" +
                    "        \"email\": \"shereedavid@orbixtar.com\",\n" +
                    "        \"phone\": \"+1 (914) 502-2504\",\n" +
                    "        \"address\": \"129 Crawford Avenue, Biehle, Wisconsin, 9073\",\n" +
                    "        \"about\": \"Veniam eiusmod pariatur minim ad minim aliqua nulla. Velit ad nostrud dolore ea anim minim dolor nostrud sunt duis fugiat et ipsum irure. Aliqua enim nisi enim ut Lorem reprehenderit sint eiusmod dolore. Officia esse eu do labore elit ut velit. Sunt ad ullamco deserunt sint.\\r\\n\",\n" +
                    "        \"registered\": \"2014-01-01T16:37:58 +02:00\",\n" +
                    "        \"latitude\": -80.518637,\n" +
                    "        \"longitude\": 0.437424,\n" +
                    "        \"tags\": [\n" +
                    "            \"ipsum\",\n" +
                    "            \"pariatur\",\n" +
                    "            \"in\",\n" +
                    "            \"cupidatat\",\n" +
                    "            \"adipisicing\",\n" +
                    "            \"tempor\",\n" +
                    "            \"laborum\"\n" +
                    "        ],\n" +
                    "        \"friends\": [\n" +
                    "            {\n" +
                    "                \"id\": 0,\n" +
                    "                \"name\": \"Aileen Powell\"\n" +
                    "            },\n" +
                    "            {\n" +
                    "                \"id\": 1,\n" +
                    "                \"name\": \"Page Padilla\"\n" +
                    "            },\n" +
                    "            {\n" +
                    "                \"id\": 2,\n" +
                    "                \"name\": \"Opal Keith\"\n" +
                    "            }\n" +
                    "        ],\n" +
                    "        \"greeting\": \"Hello, Sheree David! You have 2 unread messages.\",\n" +
                    "        \"favoriteFruit\": \"apple\"\n" +
                    "    },\n" +
                    "    {\n" +
                    "        \"id\": 3,\n" +
                    "        \"guid\": \"e998b10d-edcb-438b-8001-ccfc07077c2a\",\n" +
                    "        \"isActive\": false,\n" +
                    "        \"balance\": \"$1,862.74\",\n" +
                    "        \"picture\": \"http://placehold.it/32x32\",\n" +
                    "        \"age\": 35,\n" +
                    "        \"eyeColor\": \"brown\",\n" +
                    "        \"name\": \"Price Rosales\",\n" +
                    "        \"gender\": \"male\",\n" +
                    "        \"company\": \"POOCHIES\",\n" +
                    "        \"email\": \"pricerosales@poochies.com\",\n" +
                    "        \"phone\": \"+1 (898) 492-2086\",\n" +
                    "        \"address\": \"694 Bayview Avenue, Vallonia, New Hampshire, 9700\",\n" +
                    "        \"about\": \"Labore consequat in qui aute enim duis ad officia qui in deserunt deserunt esse esse. Sunt proident nulla officia et veniam veniam aliqua sint magna enim irure. Excepteur minim officia minim et.\\r\\n\",\n" +
                    "        \"registered\": \"2014-04-01T03:04:43 +03:00\",\n" +
                    "        \"latitude\": -40.270523,\n" +
                    "        \"longitude\": -82.67422,\n" +
                    "        \"tags\": [\n" +
                    "            \"voluptate\",\n" +
                    "            \"sint\",\n" +
                    "            \"adipisicing\",\n" +
                    "            \"incididunt\",\n" +
                    "            \"fugiat\",\n" +
                    "            \"tempor\",\n" +
                    "            \"eiusmod\"\n" +
                    "        ],\n" +
                    "        \"friends\": [\n" +
                    "            {\n" +
                    "                \"id\": 0,\n" +
                    "                \"name\": \"Sheri Winters\"\n" +
                    "            },\n" +
                    "            {\n" +
                    "                \"id\": 1,\n" +
                    "                \"name\": \"Stewart Donaldson\"\n" +
                    "            },\n" +
                    "            {\n" +
                    "                \"id\": 2,\n" +
                    "                \"name\": \"Rena Snow\"\n" +
                    "            }\n" +
                    "        ],\n" +
                    "        \"greeting\": \"Hello, Price Rosales! You have 2 unread messages.\",\n" +
                    "        \"favoriteFruit\": \"banana\"\n" +
                    "    },\n" +
                    "    {\n" +
                    "        \"id\": 4,\n" +
                    "        \"guid\": \"99494f34-e051-4e9e-a575-76c7899da486\",\n" +
                    "        \"isActive\": true,\n" +
                    "        \"balance\": \"$3,511.70\",\n" +
                    "        \"picture\": \"http://placehold.it/32x32\",\n" +
                    "        \"age\": 35,\n" +
                    "        \"eyeColor\": \"brown\",\n" +
                    "        \"name\": \"Weber Davis\",\n" +
                    "        \"gender\": \"male\",\n" +
                    "        \"company\": \"MOREGANIC\",\n" +
                    "        \"email\": \"weberdavis@moreganic.com\",\n" +
                    "        \"phone\": \"+1 (938) 563-3958\",\n" +
                    "        \"address\": \"885 Scott Avenue, Goldfield, Florida, 9973\",\n" +
                    "        \"about\": \"Consequat labore laborum esse aliqua ex reprehenderit do ea. Laborum dolor sunt amet id dolore in ea eu. Cupidatat sint minim amet eu incididunt officia nisi nulla eu nulla quis. Elit proident aliquip cupidatat ut magna quis reprehenderit duis. Id officia mollit sint magna pariatur esse quis reprehenderit quis enim.\\r\\n\",\n" +
                    "        \"registered\": \"2014-04-03T05:54:57 +03:00\",\n" +
                    "        \"latitude\": -11.521233,\n" +
                    "        \"longitude\": -179.173982,\n" +
                    "        \"tags\": [\n" +
                    "            \"ut\",\n" +
                    "            \"Lorem\",\n" +
                    "            \"nostrud\",\n" +
                    "            \"ut\",\n" +
                    "            \"ea\",\n" +
                    "            \"laboris\",\n" +
                    "            \"voluptate\"\n" +
                    "        ],\n" +
                    "        \"friends\": [\n" +
                    "            {\n" +
                    "                \"id\": 0,\n" +
                    "                \"name\": \"Bowen Powers\"\n" +
                    "            },\n" +
                    "            {\n" +
                    "                \"id\": 1,\n" +
                    "                \"name\": \"Luella England\"\n" +
                    "            },\n" +
                    "            {\n" +
                    "                \"id\": 2,\n" +
                    "                \"name\": \"Casey Hardin\"\n" +
                    "            }\n" +
                    "        ],\n" +
                    "        \"greeting\": \"Hello, Weber Davis! You have 1 unread messages.\",\n" +
                    "        \"favoriteFruit\": \"banana\"\n" +
                    "    }\n" +
                    "]");
        }
    }

}
