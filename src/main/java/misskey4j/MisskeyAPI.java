package misskey4j;

public enum MisskeyAPI {

    // ------------------------------------------ //
    // Meta
    // ------------------------------------------ //

    Meta("meta"),
    Emojis("emojis"),

    // ------------------------------------------ //
    // Notes
    // ------------------------------------------ //

    NotesCreate("notes/create"),
    NotesDelete("notes/delete"),
    NotesUnrenote("notes/unrenote"),

    Notes("notes"),
    NotesShow("notes/show"),
    UsersNotes("users/notes"),
    NotesSearch("notes/search"),
    NotesTimeline("notes/timeline"),
    NotesMentions("notes/mentions"),
    NotesFeatured("notes/featured"),
    NotesLocalTimeline("notes/local-timeline"),
    NotesHybridTimeline("notes/hybrid-timeline"),
    NotesGlobalTimeline("notes/global-timeline"),
    NotesUserListTimeline("notes/user-list-timeline"),

    NotesConversation("notes/conversation"),
    NotesChildren("notes/children"),

    // ------------------------------------------ //
    // Users
    // ------------------------------------------ //

    UsersFollowers("users/followers"),
    UsersFollowing("users/following"),

    UsersShow("users/show"),
    UsersRelation("users/relation"),
    UsersSearch("users/search"),

    // ------------------------------------------ //
    // I
    // ------------------------------------------ //

    I("i"),
    IFavorites("i/favorites"),
    INotifications("i/notifications"),
    IWebhooksUpdate("i/webhooks/update"),
    IWebhooksShow("i/webhooks/show"),
    IWebhooksList("i/webhooks/list"),
    IWebhooksDelete("i/webhooks/delete"),
    IWebhooksCreate("i/webhooks/create"),


    // ------------------------------------------ //
    // Auth
    // ------------------------------------------ //

    AuthSessionGenerate("auth/session/generate"),
    AuthSessionUserkey("auth/session/userkey"),

    // ------------------------------------------ //
    // App
    // ------------------------------------------ //

    AppCreate("app/create"),

    // ------------------------------------------ //
    // Lists
    // ------------------------------------------ //

    Lists("users/lists/list"),
    ListsShow("users/lists/show"),

    // ------------------------------------------ //
    // Following
    // ------------------------------------------ //

    FollowingCreate("following/create"),
    FollowingDelete("following/delete"),

    // ------------------------------------------ //
    // Polls
    // ------------------------------------------ //

    PollsVote("notes/polls/vote"),

    // ------------------------------------------ //
    // Messages
    // ------------------------------------------ //

    Messages("messaging/messages"),
    MessagesHistory("messaging/history"),
    MessagesCreate("messaging/messages/create"),
    MessagesDelete("messaging/messages/delete"),

    // ------------------------------------------ //
    // Mutes
    // ------------------------------------------ //

    MutesList("mute/list"),
    MutesCreate("mute/create"),
    MutesDelete("mute/delete"),

    // ------------------------------------------ //
    // Blocks
    // ------------------------------------------ //

    BlocksList("blocking/list"),
    BlocksCreate("blocking/create"),
    BlocksDelete("blocking/delete"),

    // ------------------------------------------ //
    // Favorites
    // ------------------------------------------ //

    FavoritesCreate("notes/favorites/create"),
    FavoritesDelete("notes/favorites/delete"),

    // ------------------------------------------ //
    // Reactions
    // ------------------------------------------ //

    ReactionsCreate("notes/reactions/create"),
    ReactionsDelete("notes/reactions/delete"),

    // ------------------------------------------ //
    // Files
    // ------------------------------------------ //

    FilesCreate("drive/files/create"),

    // ------------------------------------------ //
    // Hashtags
    // ------------------------------------------ //

    HashtagsTrend("hashtags/trend"),

    // ------------------------------------------ //
    // Other
    // ------------------------------------------ //

    ServiceWorkerRegister("sw/register"),
    ;

    private String code;

    MisskeyAPI(String code) {
        this.code = code;
    }

    public String code() {
        return code;
    }
}
