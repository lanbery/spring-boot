package com.lollipop.util;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.lollipop.model.Questions;
import com.lollipop.util.domain.Header;
import com.lollipop.util.domain.Param;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * The type Get paper.
 */
public final class GetPaperDetails {
    /**
     * The constant logger.
     */
    static final Logger logger = LoggerFactory.getLogger(GetPaperDetails.class);

    /**
     * Gets chapter.
     *
     * @param progressId the progress id
     * @param other      the other
     * @return the chapter
     */
    public static String getChapter(
            final String progressId, final String other) {
        String url =
                "https://kuailexue.com/math/papers/progress?progress_id="
                        + progressId + "&_=" + other;
        ArrayList<Header> ah = new ArrayList<Header>();
        ah.add(new Header("Cookie",
                "_xsrf=2|b7615019|0a7af817dc4998545f9cb7fb22e2cb25|1467700785; "
                        + "user=\"2|1:0|10:1467814984|4:user|"
                        + "172:eyJ1c2VybmFtZSI6ICJrbHgxODAxNTExMTg2OF8yMDE2IiwgImxvZ2luX3NuIjogImRZc3VBN3VaRU56anI3eUgiLCAibG9naW5fdG9rZW4iOiAiMDAxN2NkZjU1YmQ1NDQ5ZmIwZWI2MWJiZGExNTNlNmUiLCAicm9sZSI6IDF9"
                        + "|aee9d08b4809177ef320e109eb2876cc1c071b9f09da33b73711f3da93ee22df\"; "
                        + "login_token=\"2|1:0|10:1467875698|11:login_token"
                        + "|44:MDAxN2NkZjU1YmQ1NDQ5ZmIwZWI2MWJiZGExNTNlNmU="
                        + "|aa6ddfd0efd2e13c9d8898f3ac5a81e1833ca1e08e66b9575b388b24f86b18fb\"; "
                        + "Hm_lvt_e1844f92fc40dfb52ea9dbdf08afe80c=1467701065,1467701550; "
                        + "Hm_lpvt_e1844f92fc40dfb52ea9dbdf08afe80c=1467877864"));
        return HttpClient.get(url, ah);
    }

    /**
     * Union paper string.获取包含 tid 的 json.
     *
     * @return the string
     */
    public static String unionPaper() {
        String url = "https://kuailexue.com/math/papers/new/set_template_parameters?tname=shijuan";

        ArrayList<Header> ah = new ArrayList<Header>();
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
     * @param tid the id
     * @return the paper
     */
    public static String getPaper(final String tid) {
        String getUrl = "https://kuailexue.com/math/paper/" + tid + "/edit";

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
        } else {
            logger.info("paper is null");
        }
        return j;
    }

    /**
     * Gets paper question.
     *
     * @param paperJson the paper json
     * @return the paper question
     */
    public static ArrayList<Questions> getPaperQuestion(final String paperJson) {
        JsonParser parser = new JsonParser();
        JsonObject object = (JsonObject) parser.parse(paperJson);

        String grade = object.get("grade").getAsString();
        JsonObject teachingProgress = object.getAsJsonObject("teaching_progress");
        JsonArray textbooks = teachingProgress.getAsJsonArray("textbooks");
        Iterator<JsonElement> textbookIt = textbooks.iterator();
        while (textbookIt.hasNext()) {
            JsonObject book = textbookIt.next().getAsJsonObject();
            book.get("title").getAsString();
            book.get("_id").getAsString();

            if (!book.get("parent").isJsonNull()) {
                String parentId = book.get("parent").getAsString();
                logger.info("parentId={}", parentId);
            }

            if (!book.get("children").isJsonNull()) {
                Iterator<JsonElement> childrenIt = book.getAsJsonArray("children").iterator();
                while (childrenIt.hasNext()) {
                    String childrenId = childrenIt.next().getAsString();
                    logger.info("childrenId={}", childrenId);
                }
            }
        }

        JsonArray progress = teachingProgress.getAsJsonArray("progress");
        Iterator<JsonElement> progressIt = progress.iterator();
        while (progressIt.hasNext()) {
            JsonObject progressObj = progressIt.next().getAsJsonObject();
            String completed = progressObj.get("completed").getAsString();
            String rootId = progressObj.get("root_id").getAsString();
            logger.info("completed={},root_id={}", completed, rootId);
        }

        String textbookVer = teachingProgress.get("textbook_ver").getAsString();

        logger.info("grade={},textbookVer={}", grade, textbookVer);

        //  parts迭代
        JsonArray parts = object.getAsJsonArray("parts");
        Iterator<JsonElement> partsIt = parts.iterator();
        while (partsIt.hasNext()) {
            JsonArray part = partsIt.next().getAsJsonArray();

            // part
            Iterator<JsonElement> partIt = part.iterator();
            while (partIt.hasNext()) {
                JsonObject questions = partIt.next().getAsJsonObject();
                String itemId = questions.get("item_id").getAsString();  //题目Id
                String type = questions.get("type").getAsString();   //题目类型
                String paperdifficulty = questions.get("difficulty").getAsString();  //试卷难度
                String itemHtml = questions.get("item_html").getAsString();  //题目详情

                Pattern answerP = Pattern.compile("<div class=\"dt\">答案.*<div class=\"dt\">");
                Pattern jiexiP = Pattern.compile("<div class=\"dt\">解析.*<div class=\"dt\">");
                //<div class="dt">答案：</div><div class="dd">\(\left(-1,\sqrt{2}-1\right)\)</div></div><div class="exp"><div class="dt">
                if (!"".equals(itemHtml)) {
                    Matcher amatcher = answerP.matcher(itemHtml);
                    Matcher jmatcher = jiexiP.matcher(itemHtml);
                    while (amatcher.find() && jmatcher.find()) {
                        String answer = amatcher.group();
                        String jiexi = jmatcher.group();
                        logger.info("answer = {},jiexi = {} ", answer, jiexi);
                    }
                } else {
                    logger.info("paper is null");
                }

                JsonObject data = questions.getAsJsonObject("data");
                String difficulty = data.get("difficulty").getAsString();   //题目难度

                logger.info("itemId={},type={},paperdifficulty={},itemHtml={},difficulty={}", itemId, type, paperdifficulty, itemHtml, difficulty);

                //  qs迭代
                JsonArray qs = data.getAsJsonArray("qs"); // qs
                Iterator<JsonElement> qsDetails = qs.iterator();
                while (qsDetails.hasNext()) {
                    JsonObject tagObj = qsDetails.next().getAsJsonObject();

                    // tagPaths迭代
                    Iterator<JsonElement> tagPathsIt = tagObj.getAsJsonArray("tag_paths").iterator();
                    while (tagPathsIt.hasNext()) {
                        Iterator<JsonElement> detailsIt = tagPathsIt.next().getAsJsonArray().iterator();
                        while (detailsIt.hasNext()) {
                            JsonObject detail = detailsIt.next().getAsJsonObject();
                            String detailType = detail.get("type_").getAsString();
                            String detailId = detail.get("_id").getAsString();
                            String detailName = detail.get("name").getAsString();
                            logger.info("detail_type={},detail_id={},detail_name={}", detailType, detailId, detailName);
                        }
                    }

                    // tagIds 迭代
                    Iterator<JsonElement> tagIdsIt = tagObj.getAsJsonArray("tag_ids").iterator();
                    while (tagIdsIt.hasNext()) {
                        String tagId = tagIdsIt.next().getAsString();
                        logger.info("tagId={}", tagId);
                    }
                }
            }
        }
        return null;
    }
}
