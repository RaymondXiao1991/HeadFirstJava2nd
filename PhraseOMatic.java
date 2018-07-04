public class PhraseOMatic {
  public static void main(String[] args) {
    String[] wordListOne = {
      "24/7",
      "multiTier",
      "30,000 foot",
      "B-to-B",
      "win-win",
      "frontend",
      "web-based",
      "pervasive",
      "smart",
      "sixsigma",
      "critical-path",
      "dynamic"
    };

    String[] wordListTwo = {
      "empowered",
      "sticky",
      "value-added",
      "oriented",
      "centric",
      "distributed",
      "clustered",
      "branded",
      "outside-the-box",
      "positioned",
      "networked",
      "focused",
      "leveraged",
      "aligned",
      "targeted",
      "shared",
      "cooperative",
      "accelerated"
    };

    String[] wordListThree = {
      "process",
      "tippingpoint",
      "solution",
      "architecture",
      "core competency",
      "strategy",
      "mindshare",
      "portal",
      "space",
      "vision",
      "paradigm",
      "mission"
    };

    // 计算每一组有多少个名词术语
    int oneLength = wordListOne.length;
    int twoLength = wordListTwo.length;
    int threeLength = wordListThree.length;

    // 产生随机数字
    int randOne = (int) (Math.random() * oneLength);
    int randTwo = (int) (Math.random() * twoLength);
    int randThree = (int) (Math.random() * threeLength);

    // 组合出专家术语
    String phrase =
        wordListOne[randOne] + " " + wordListTwo[randTwo] + " " + wordListThree[randThree];

    // 输出
    System.out.println("What we need is a " + phrase);
  }
}
