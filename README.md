# Learn-Java-Deserialization-Vulnerability
Recently learning about Java deserialization vulnerabilities, I will push the vulnerability payload and vulnerability analysis articles that I have analyzed.

## Deserialization Vulnerability List

I will first analyze the vulnerability payload in the following Java libraries.

- [ ] Groovy
- [ ] JDK7u21
- [ ] Apache Common Collection
- [ ] Spring
- [x] FastJson
    - [x] FastJson Basic
    - [x] FastJson TemplatesImpl
    - [x] FastJson JdbcRowSetImpl
    - [x] FastJson Bypass
- [ ] JNDI Injection
- [ ] Jackson
- [ ] XMLDecoder
- [x] SnakeYaml

After that, I will find some deserialization vulnerabilities in practical applications for analysis.

## Articles List

- [Java SnakeYaml反序列化](http://drops.blbana.cc/2020/03/24/Java-SnakeYaml%E5%8F%8D%E5%BA%8F%E5%88%97%E5%8C%96/)
- FastJson
    - [Fastjson反序列化漏洞基础](http://drops.blbana.cc/2020/03/29/Fastjson%E5%8F%8D%E5%BA%8F%E5%88%97%E5%8C%96%E6%BC%8F%E6%B4%9E%E5%9F%BA%E7%A1%80/)
    - [Fastjson TemplatesImpl利用链](https://drops.blbana.cc/2020/04/01/Fastjson-TemplatesImpl-%E5%88%A9%E7%94%A8%E9%93%BE/)
    - [Fastjson JdbcRowSetImpl利用链](https://drops.blbana.cc/2020/04/16/Fastjson-JdbcRowSetImpl%E5%88%A9%E7%94%A8%E9%93%BE/)
    - [Fastjson历史补丁Bypass分析](https://drops.blbana.cc/2020/04/16/Fastjson%E5%8E%86%E5%8F%B2%E8%A1%A5%E4%B8%81Bypass%E5%88%86%E6%9E%90/)
## My Blog

 👉  [Welcome to my blog](http://drops.blbana.cc/)  👈

