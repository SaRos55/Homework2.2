data class Post(
    val id: Int,
    val ownerID: Int,
    val fromID: Int,
    val createdBy: Int,
    val date: Int,
    val text: String,
    val replyOwnerID: Int,
    val replyPostID: Int,
    val friendsOnly: Boolean,
    val comments: Comments,
    val copyright: Copyright,
    val likes: Likes,
    val reposts: Reposts,
    val views: Views,
    val postType: String,
    val signerID: Int,
    val canPin: Boolean,
    val canDelete: Boolean,
    val canEdit: Boolean,
    val isPinned: Boolean,
    val markedAsAds: Boolean,
    val isFavorite: Boolean,
    val donut: Donut,
    val postponedID: Int
)

class Comments(
    val count: Int,
    val canPost: Boolean,
    val groupsCanPost: Boolean,
    val canClose: Boolean,
    val canOpen: Boolean
)

class Copyright(
    val id: Int,
    val link: String,
    val name: String,
    val type: String
)

class Likes(
    val count: Int,
    val userLikes: Boolean,
    val canLike: Boolean,
    val canPublish: Boolean
)

class Reposts(
    val count: Int,
    val userReposted: Boolean
)

class Views(
    val count: Int
)

class Donut(
    val isDonut: Boolean,
    val paidDuration: Int,
    val canPublishFreeCopy: Boolean,
    val editMode: String
)

//object WallService {
class WallService {
    private var posts = emptyArray<Post>()
    private var id: Int = 0

    fun add(post: Post): Post {
        id += 1
        val postWithID = post.copy(id = id)
        posts += postWithID
        return posts.last()
    }

    fun update(post: Post): Boolean {
        for ((index, p) in posts.withIndex()) {
            if (p.id == post.id) {
                posts[index] = post.copy(id = post.id, date = post.date)
                return true
            }
        }
        return false
    }
}