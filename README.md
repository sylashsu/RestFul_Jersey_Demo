# RestFul_Jersey_Demo

REST 與 JSR（jersey)
JSR－311 Java API for RESTful Web Services (JAX-RS) 1.0 and 1.1
JAX-RS是將在JavaEE 6引起的一種新技術。
JAX-RS即Java API for RESTful Web Services，
是一個Java 編程語言的應用程序接口 ，支持按照表述性狀態轉移（REST）架構風格創建Web服務。
JAX-RS使用了Java SE5引入的Java標註來簡化Web服務的客戶端和服務端 的開發和部署。

```java
@Path，標註資源類或者方法的相對路徑 　　
@GET，@PUT，@POST，@DELETE，標註方法是HTTP請求的類型。　　
@Produces，標註返回的MIME媒體類型 　　
@Consumes，標註可接受請求的MIME媒體類型
```

分別標註方法的參數來自於HTTP請求的不同位置，例如:
```java
@PathParam來自於URL的路徑，
@QueryParam來自於URL的查詢參數，
@HeaderParam來自於HTTP請求的頭信息，
@CookieParam來自於HTTP請求的Cookie，
@FormParam來自於HTTP請求的post的form格式
```

Jersey 是 JAX-RS 的參考實現，它包含三個主要部分:
核心服務器（Core Server）：通過提供 JSR 311 中標準化的註釋和 API 標準化，您可以用直觀的方式開發 RESTful Web 服務。
核心客戶端（Core Client）：Jersey 客戶端 API 幫助您與 REST 服務輕鬆通信。
集成（Integration）：Jersey 還提供可以輕鬆集成 Spring、Guice、Apache Abdera 的庫。

```java
@PATH   Resource的位置
@GET, @POST, @PUT, @DELETE  所處理的Http Method。
@Consumes   所處理的Mime Type。對應到Http Request Header的Content-Type
@Produces   可產生的Mime Type。對應到Http Request Header的Accept
@PathParam  把變數對應到@Path中所定義的參數@QueryParam把變數對應到URI中的QueryString所定義的參數
@FormParam  把變數對應到Form中所定義的參數
@HeaderParam    把變數對應到某個Header的變數
@Context    將Container的Context注射(inject)到POJO當中
```