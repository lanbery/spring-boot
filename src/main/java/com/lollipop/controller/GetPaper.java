package com.lollipop.controller;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.lollipop.util.HttpClient;
import com.lollipop.util.domain.Header;
import com.lollipop.util.domain.Param;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by lollipop on 16/7/7.
 */
public  class GetPaper {
    final static Logger logger = LoggerFactory.getLogger(GetPaper.class);

    /**
     * Gets tid.
     *
     * @return the tid
     */
    public static String getTid() {
        JsonParser parser = new JsonParser();
        JsonObject object = (JsonObject) parser.parse(unionPaper());
        JsonObject obj = object.getAsJsonObject("data");
        String tid = obj.get("tid").getAsString();
        logger.info("get tid={}", tid);
        return tid;
    }

    /**
     * Gets paper.
     *
     * @param id the id
     * @return the paper
     */
    public static String getPaper(String id) {
        String getUrl;
        if ("".equals(id)) {
            getUrl = "https://kuailexue.com/math/paper/" + getTid() + "/edit";
        } else {
            getUrl = "https://kuailexue.com/math/paper/" + id + "/edit";
        }

        logger.info("url = : {}", getUrl);
        ArrayList<Header> ah = new ArrayList<Header>();
        ah.add(new Header("Cookie", "_xsrf=2|b7615019|0a7af817dc4998545f9cb7fb22e2cb25|1467700785; user=\"2|1:0|10:1467814984|4:user|172:eyJ1c2VybmFtZSI6ICJrbHgxODAxNTExMTg2OF8yMDE2IiwgImxvZ2luX3NuIjogImRZc3VBN3VaRU56anI3eUgiLCAibG9naW5fdG9rZW4iOiAiMDAxN2NkZjU1YmQ1NDQ5ZmIwZWI2MWJiZGExNTNlNmUiLCAicm9sZSI6IDF9|aee9d08b4809177ef320e109eb2876cc1c071b9f09da33b73711f3da93ee22df\"; login_token=\"2|1:0|10:1467875698|11:login_token|44:MDAxN2NkZjU1YmQ1NDQ5ZmIwZWI2MWJiZGExNTNlNmU=|aa6ddfd0efd2e13c9d8898f3ac5a81e1833ca1e08e66b9575b388b24f86b18fb\"; Hm_lvt_e1844f92fc40dfb52ea9dbdf08afe80c=1467701065,1467701550; Hm_lpvt_e1844f92fc40dfb52ea9dbdf08afe80c=1467877864"));
        String result = HttpClient.get(getUrl, ah);
        logger.info("get result : ", result);
        String j = "";
        if (!"".equals(result)) {
            Pattern p = Pattern.compile("\\{\"grade\".*\\}");
            Matcher matcher = p.matcher(result);

            while (matcher.find()) {
                j = matcher.group();
            }
        }
        return j;
    }

    /**
     * Union paper string.
     *
     * @return the string
     */
    public static String unionPaper() {
        String url = "https://kuailexue.com/math/papers/new/set_template_parameters?tname=shijuan";

        ArrayList<Header> ah = new ArrayList<Header>();
        ah.add(new Header("Accept", "application/json, text/javascript, */*; q=0.01"));
        ah.add(new Header("Origin", "https://kuailexue.com"));
        ah.add(new Header("X-Requested-With", "XMLHttpRequest"));
        ah.add(new Header("Content-Type", "application/x-www-form-urlencoded; charset=UTF-8"));
        ah.add(new Header("Referer", "https://kuailexue.com/math/exams/new/set_template_parameters?tname=shijuan"));
        ah.add(new Header("Accept-Encoding", "gzip, deflate, br"));
        ah.add(new Header("Cookie", "_xsrf=2|b7615019|0a7af817dc4998545f9cb7fb22e2cb25|1467700785; user=\"2|1:0|10:1467814984|4:user|172:eyJ1c2VybmFtZSI6ICJrbHgxODAxNTExMTg2OF8yMDE2IiwgImxvZ2luX3NuIjogImRZc3VBN3VaRU56anI3eUgiLCAibG9naW5fdG9rZW4iOiAiMDAxN2NkZjU1YmQ1NDQ5ZmIwZWI2MWJiZGExNTNlNmUiLCAicm9sZSI6IDF9|aee9d08b4809177ef320e109eb2876cc1c071b9f09da33b73711f3da93ee22df\"; login_token=\"2|1:0|10:1467875698|11:login_token|44:MDAxN2NkZjU1YmQ1NDQ5ZmIwZWI2MWJiZGExNTNlNmU=|aa6ddfd0efd2e13c9d8898f3ac5a81e1833ca1e08e66b9575b388b24f86b18fb\"; Hm_lvt_e1844f92fc40dfb52ea9dbdf08afe80c=1467701065,1467701550; Hm_lpvt_e1844f92fc40dfb52ea9dbdf08afe80c=1467877948; _xsrf=2|b7615019|0a7af817dc4998545f9cb7fb22e2cb25|1467700785; user=\"2|1:0|10:1467814984|4:user|172:eyJ1c2VybmFtZSI6ICJrbHgxODAxNTExMTg2OF8yMDE2IiwgImxvZ2luX3NuIjogImRZc3VBN3VaRU56anI3eUgiLCAibG9naW5fdG9rZW4iOiAiMDAxN2NkZjU1YmQ1NDQ5ZmIwZWI2MWJiZGExNTNlNmUiLCAicm9sZSI6IDF9|aee9d08b4809177ef320e109eb2876cc1c071b9f09da33b73711f3da93ee22df\"; login_token=\"2|1:0|10:1467875698|11:login_token|44:MDAxN2NkZjU1YmQ1NDQ5ZmIwZWI2MWJiZGExNTNlNmU=|aa6ddfd0efd2e13c9d8898f3ac5a81e1833ca1e08e66b9575b388b24f86b18fb\"; Hm_lvt_e1844f92fc40dfb52ea9dbdf08afe80c=1467701065,1467701550; Hm_lpvt_e1844f92fc40dfb52ea9dbdf08afe80c=1467877864; _xsrf=2|b7615019|0a7af817dc4998545f9cb7fb22e2cb25|1467700785; user=\"2|1:0|10:1467814984|4:user|172:eyJ1c2VybmFtZSI6ICJrbHgxODAxNTExMTg2OF8yMDE2IiwgImxvZ2luX3NuIjogImRZc3VBN3VaRU56anI3eUgiLCAibG9naW5fdG9rZW4iOiAiMDAxN2NkZjU1YmQ1NDQ5ZmIwZWI2MWJiZGExNTNlNmUiLCAicm9sZSI6IDF9|aee9d08b4809177ef320e109eb2876cc1c071b9f09da33b73711f3da93ee22df\"; login_token=\"2|1:0|10:1467945335|11:login_token|44:MDAxN2NkZjU1YmQ1NDQ5ZmIwZWI2MWJiZGExNTNlNmU=|e7e3c6790791606a28e0bff88d2a08e6a024d34a8f8f3ba9fd1d2b022b422117\"; Hm_lvt_e1844f92fc40dfb52ea9dbdf08afe80c=1467701065,1467701550; Hm_lpvt_e1844f92fc40dfb52ea9dbdf08afe80c=1467964438"));

        ArrayList<Param> ap = new ArrayList<Param>();
        ap.add(new Param("_xsrf", "2|b7615019|0a7af817dc4998545f9cb7fb22e2cb25|1467700785"));
        ap.add(new Param("defaults", "{\"sources\":[1,3,5,7],\"difficulty\":3,\"exam_duration\":120}"));
        ap.add(new Param("name", "未命名"));
        ap.add(new Param("parts", "[[{\"type\":1001,\"subtype\":1,\"q_score\":5,\"tag_ids\":[]},{\"type\":1001,\"subtype\":1,\"q_score\":5,\"tag_ids\":[]},{\"type\":1001,\"subtype\":1,\"q_score\":5,\"tag_ids\":[]},{\"type\":1001,\"subtype\":1,\"q_score\":5,\"tag_ids\":[]},{\"type\":1001,\"subtype\":1,\"q_score\":5,\"tag_ids\":[]},{\"type\":1001,\"subtype\":1,\"q_score\":5,\"tag_ids\":[]},{\"type\":1001,\"subtype\":1,\"q_score\":5,\"tag_ids\":[]},{\"type\":1001,\"subtype\":1,\"q_score\":5,\"tag_ids\":[]},{\"type\":1001,\"subtype\":1,\"q_score\":5,\"tag_ids\":[]},{\"type\":1001,\"subtype\":1,\"q_score\":5,\"tag_ids\":[]},{\"type\":1001,\"subtype\":1,\"q_score\":5,\"tag_ids\":[]},{\"type\":1001,\"subtype\":1,\"q_score\":5,\"tag_ids\":[]},{\"type\":1001,\"subtype\":1,\"q_score\":5,\"tag_ids\":[]},{\"type\":1001,\"subtype\":1,\"q_score\":5,\"tag_ids\":[]},{\"type\":1001,\"subtype\":1,\"q_score\":5,\"tag_ids\":[]},{\"type\":1001,\"subtype\":1,\"q_score\":5,\"tag_ids\":[]},{\"type\":1001,\"subtype\":1,\"q_score\":5,\"tag_ids\":[]},{\"type\":1001,\"subtype\":1,\"q_score\":5,\"tag_ids\":[]},{\"type\":1001,\"subtype\":1,\"q_score\":5,\"tag_ids\":[]},{\"type\":1001,\"subtype\":1,\"q_score\":5,\"tag_ids\":[]}],[{\"type\":1002,\"subtype\":1,\"q_score\":5,\"tag_ids\":[]},{\"type\":1002,\"subtype\":1,\"q_score\":5,\"tag_ids\":[]},{\"type\":1002,\"subtype\":1,\"q_score\":5,\"tag_ids\":[]},{\"type\":1002,\"subtype\":1,\"q_score\":5,\"tag_ids\":[]},{\"type\":1002,\"subtype\":1,\"q_score\":5,\"tag_ids\":[]},{\"type\":1002,\"subtype\":1,\"q_score\":5,\"tag_ids\":[]},{\"type\":1002,\"subtype\":1,\"q_score\":5,\"tag_ids\":[]},{\"type\":1002,\"subtype\":1,\"q_score\":5,\"tag_ids\":[]},{\"type\":1002,\"subtype\":1,\"q_score\":5,\"tag_ids\":[]},{\"type\":1002,\"subtype\":1,\"q_score\":5,\"tag_ids\":[]},{\"type\":1002,\"subtype\":1,\"q_score\":5,\"tag_ids\":[]},{\"type\":1002,\"subtype\":1,\"q_score\":5,\"tag_ids\":[]},{\"type\":1002,\"subtype\":1,\"q_score\":5,\"tag_ids\":[]},{\"type\":1002,\"subtype\":1,\"q_score\":5,\"tag_ids\":[]},{\"type\":1002,\"subtype\":1,\"q_score\":5,\"tag_ids\":[]},{\"type\":1002,\"subtype\":1,\"q_score\":5,\"tag_ids\":[]},{\"type\":1002,\"subtype\":1,\"q_score\":5,\"tag_ids\":[]},{\"type\":1002,\"subtype\":1,\"q_score\":5,\"tag_ids\":[]},{\"type\":1002,\"subtype\":1,\"q_score\":5,\"tag_ids\":[]},{\"type\":1002,\"subtype\":1,\"q_score\":5,\"tag_ids\":[]}],[{\"type\":1003,\"subtype\":1,\"q_score\":13,\"tag_ids\":[]},{\"type\":1003,\"subtype\":1,\"q_score\":13,\"tag_ids\":[]},{\"type\":1003,\"subtype\":1,\"q_score\":13,\"tag_ids\":[]},{\"type\":1003,\"subtype\":1,\"q_score\":13,\"tag_ids\":[]},{\"type\":1003,\"subtype\":1,\"q_score\":13,\"tag_ids\":[]},{\"type\":1003,\"subtype\":1,\"q_score\":13,\"tag_ids\":[]},{\"type\":1003,\"subtype\":1,\"q_score\":13,\"tag_ids\":[]},{\"type\":1003,\"subtype\":1,\"q_score\":13,\"tag_ids\":[]},{\"type\":1003,\"subtype\":1,\"q_score\":13,\"tag_ids\":[]},{\"type\":1003,\"subtype\":1,\"q_score\":13,\"tag_ids\":[]},{\"type\":1003,\"subtype\":1,\"q_score\":13,\"tag_ids\":[]},{\"type\":1003,\"subtype\":1,\"q_score\":13,\"tag_ids\":[]},{\"type\":1003,\"subtype\":1,\"q_score\":13,\"tag_ids\":[]},{\"type\":1003,\"subtype\":1,\"q_score\":13,\"tag_ids\":[]},{\"type\":1003,\"subtype\":1,\"q_score\":13,\"tag_ids\":[]},{\"type\":1003,\"subtype\":1,\"q_score\":13,\"tag_ids\":[]},{\"type\":1003,\"subtype\":1,\"q_score\":13,\"tag_ids\":[]},{\"type\":1003,\"subtype\":1,\"q_score\":13,\"tag_ids\":[]},{\"type\":1003,\"subtype\":1,\"q_score\":13,\"tag_ids\":[]},{\"type\":1003,\"subtype\":1,\"q_score\":13,\"tag_ids\":[]}]]"));
        ap.add(new Param("progress", "[{\"root_id\":\"53a3fc0de13823455aa072a6\",\"completed\":true,\"children\":[]},{\"root_id\":\"53a3fc0de13823455aa072b2\",\"completed\":true,\"children\":[]},{\"root_id\":\"53a3fc0de13823455aa072ba\",\"completed\":true,\"children\":[]},{\"root_id\":\"53a3fc0de13823455aa072ca\",\"completed\":true,\"children\":[]},{\"root_id\":\"53a3fc0de13823455aa072d9\",\"completed\":true,\"children\":[]},{\"root_id\":\"53a3fc0de13823455aa072e7\",\"completed\":true,\"children\":[]},{\"root_id\":\"53a3fc0de13823455aa072f7\",\"completed\":true,\"children\":[]},{\"root_id\":\"53a3fc0de13823455aa07308\",\"completed\":true,\"children\":[]},{\"root_id\":\"53a3fc0de13823455aa07317\",\"completed\":true,\"children\":[]},{\"root_id\":\"53a3fc0de13823455aa07327\",\"completed\":true,\"children\":[]},{\"root_id\":\"53a3fc0de13823455aa0733a\",\"completed\":true,\"children\":[]},{\"root_id\":\"53a3fc0de13823455aa0733b\",\"completed\":true,\"children\":[]}]\n"));
        ap.add(new Param("share", "{\"is_share\":false,\"is_school\":false,\"is_anonymous\":false}"));
        ap.add(new Param("targeted", "{\"usernames\":[],\"groups\":[]}"));
        ap.add(new Param("teaching_basic", "{\"grade\":4,\"textbook_ver\":\"苏教版\",\"grade_cat\":2}"));

        return HttpClient.post(url, ah, ap);
    }

    /**
     * Gets chapter.
     *
     * @param progress_id the progress id
     * @param other       the other
     * @return the chapter
     */
    public static String getChapter(String progress_id, String other) {
        String url = "https://kuailexue.com/math/papers/progress?progress_id=" + progress_id + "&_=" + other;
        ArrayList<Header> ah = new ArrayList<Header>();
        ah.add(new Header("Cookie", "_xsrf=2|b7615019|0a7af817dc4998545f9cb7fb22e2cb25|1467700785; user=\"2|1:0|10:1467814984|4:user|172:eyJ1c2VybmFtZSI6ICJrbHgxODAxNTExMTg2OF8yMDE2IiwgImxvZ2luX3NuIjogImRZc3VBN3VaRU56anI3eUgiLCAibG9naW5fdG9rZW4iOiAiMDAxN2NkZjU1YmQ1NDQ5ZmIwZWI2MWJiZGExNTNlNmUiLCAicm9sZSI6IDF9|aee9d08b4809177ef320e109eb2876cc1c071b9f09da33b73711f3da93ee22df\"; login_token=\"2|1:0|10:1467875698|11:login_token|44:MDAxN2NkZjU1YmQ1NDQ5ZmIwZWI2MWJiZGExNTNlNmU=|aa6ddfd0efd2e13c9d8898f3ac5a81e1833ca1e08e66b9575b388b24f86b18fb\"; Hm_lvt_e1844f92fc40dfb52ea9dbdf08afe80c=1467701065,1467701550; Hm_lpvt_e1844f92fc40dfb52ea9dbdf08afe80c=1467877864"));
        return HttpClient.get(url, ah);
    }
}
