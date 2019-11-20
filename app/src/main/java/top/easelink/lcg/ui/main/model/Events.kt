package top.easelink.lcg.ui.main.model

data class ReplyPostEvent(val replyUrl: String)

data class OpenForumEvent(val title: String, val url: String)

data class OpenArticleEvent(val url: String)