[toc]

参考来自：https://github.com/Snailclimb/springboot-guide

# 项目结构

- （java）工程代码
- （resources）静态文件
- （test）测试文件

- @SpringBootApplication启动注解

> 可以看出大概可以把 `@SpringBootApplication`看作是 `@Configuration`、`@EnableAutoConfiguration`、`@ComponentScan` 注解的集合。根据 SpringBoot官网，这三个注解的作用分别是：
>
> 1. @EnableAutoConfiguration`：启用 SpringBoot 的自动配置机制`
> 2.   `@ComponentScan`： 扫描被`@Component` (`@Service`,`@Controller`)注解的bean，注解默认会扫描该类所在的包下所有的类。
> 3. @Configuration`：允许在上下文中注册额外的bean或导入其他配置类。

# RESTful Web服务

以json格式将数据发送给客户端

- 【推荐使用？】Lombok插件

### Controller中常用注解

> 1. `@RestController`  **将返回的对象数据直接以 JSON 或 XML 形式写入 HTTP 响应(Response)中。**绝大部分情况下都是直接以  JSON 形式返回给客户端，很少的情况下才会以 XML 形式返回。转换成 XML 形式还需要额为的工作，上面代码中演示的直接就是将对象数据直接以 JSON 形式写入 HTTP 响应(Response)中。关于`@Controller`和`@RestController` 的对比，我会在下一篇文章中单独介绍到（`@Controller` +`@ResponseBody`= `@RestController`）。
> 2. `@RequestMapping` :上面的示例中没有指定 GET 与 PUT、POST 等，因为**`@RequestMapping`默认映射所有HTTP Action**，你可以使用`@RequestMapping(method=ActionType)`来缩小这个映射。
> 3. `@PostMapping`实际上就等价于 `@RequestMapping(method = RequestMethod.POST)`，同样的 `@DeleteMapping` ,`@GetMapping`也都一样，常用的 HTTP Action 都有一个这种形式的注解所对应。
> 4. `@PathVariable` :取url地址中的参数。`@RequestParam` url的查询参数值。
> 5. `@RequestBody`:可以**将 \*HttpRequest\* body 中的 JSON 类型数据反序列化为合适的 Java 类型。**
> 6. `ResponseEntity`: **表示整个HTTP Response：状态码，标头和正文内容**。我们可以使用它来自定义HTTP Response 的内容。

## @RestController和@Controller

前者是新的注解，综合了2个注解，用来返回json数据

## @PostConstruct和@PreDestroy

整个Servlet生命周期只执行一次，用来项目启动初始化和项目结束释放。

已经被Java9废弃，通过使用 `InitializingBean`和 `DisposableBean`接口可以达到相同的目的。（官方不推荐，【但是为啥要废弃哦？】）

### 读取配置信息

- 不推荐@Value("${property}")
- 通过@ConfigurationProperties读取并与bean绑定



