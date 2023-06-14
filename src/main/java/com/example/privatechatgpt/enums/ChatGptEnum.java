package com.example.privatechatgpt.enums;

public enum ChatGptEnum {

    LIST_MODELS("列出当前可用的模型，并提供有关每个模型的基本信息，例如所有者和可用性","/v1/models "),
    RETRIEVE_MODEL("检索模型实例，提供有关模型的基本信息，例如所有者和权限","/v1/models/"),
    COMPLICATIONS("给定一个提示，模型将返回一个或多个预测的完成，并且还可以在每个位置返回替代令牌的概率","/v1/completions"),
    CHAT_COMPLETION("为给定的聊天对话创建模型响应。","/v1/chat/completions"),
    EDIT("为提供的输入、指令和参数创建一个新的编辑。","/v1/edits"),


    IMG_GENERATIONS("根据提示创建图像。","/v1/images/generations"),
    IMG_EDITS("根据原始图像和提示创建编辑或扩展的图像。","/v1/images/edits"),
    IMG_VARIATIONS("创建给定图像的变体。","/v1/images/variations"),

    EMBEDDINGS("获得一个给定输入的向量表示，可以轻松地被机器学习模型和算法使用。","/v1/embeddings"),

    AUDIO_TRANSCRIPTIONS("将音频转录为输入语言。","/v1/audio/transcriptions"),
    AUDIO_TRANSLATIONS("将音频翻译成英语。","/v1/audio/translations"),

    FILE_LIST("返回属于用户组织的文件列表。","/v1/files"),
    FILE_UPLOAD("上传包含文档的文件以在各个端点/功能之间使用","/v1/files"),
    FILE_DELETE("删除文件。","/v1/files/"),
    FILE_RETRIEVE("返回有关特定文件的信息。","/v1/files/"),
    FILE_RETRIEVE_CONTENT("",""),

    FINE_TUNE_CREATE("",""),
    FINE_TUNE_LIST("",""),
    FINE_TUNE_RETRIEVE("",""),
    FINE_TUNE_CANCEL("",""),
    FINE_TUNE_EVENT_LIST("",""),
    FINE_TUNE_MODEL_DELETE("",""),

    MODERATION_CREATE("","")
     ;

    private final String desc;
private final String url;


    ChatGptEnum(String desc, String url) {
        this.desc = desc;
        this.url = url;
    }
}

