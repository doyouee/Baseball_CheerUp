package doyouee.personal_project.baseball.entity.type;

import lombok.Getter;

@Getter
public enum BaseballTeam {
    LOTTE_GIANTS("롯데자이언츠"), LG_TWINS("엘지트윈스"), SAMSUNG_LIONS("삼성라이온즈"),HANWHA_EAGLES("한화이글스"), KIA_TIGERS("기아타이거즈"),
    DOOSAN_BEARS("두산베어스"), KT_WIZ("케이티위즈"), NC_DINOS("엔씨다이노스"), KIWOOM_HEROES("키움히어로즈"), SSG_LANDERS("에스에스지랜더스");

    private final String title;
    private BaseballTeam(String title) {
        this.title = title;
    }
}
