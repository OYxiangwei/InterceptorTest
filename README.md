# InterceptorTest
springmvc拦截器
1、打开 pom.xml，添加 maven 依赖
2、配置 web.xml 文件DispatcherServlet-contextConfigLocation
3、配置文件 springmvc-config.xml（开启扫描-配置扫描包-配置视图解析器-配置拦截器）
4、编写 LoginController和TestController
5、编写login拦截器LoginInterceptor implements HandlerInterceptor（afterCompletion、postHandle、preHandle该方法将在 Controller 处理前进行调用）
6、在views文件夹编写loginform.jsp和success.jsp
