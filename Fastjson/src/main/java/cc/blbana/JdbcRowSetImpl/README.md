## Quick start
1. Start RMIServer or LDAPServer
2. Run HTTP Server in the **Exploit.class** path
   ```python
   python3 -m http.server 8000
   ```
3. Select ths fastjson version 1.2.23 in the Fastjson/pom.xml, then run the **FJdbcRowSetPoC**