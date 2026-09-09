package com.liceo.mysocial

import kotlinx.coroutines.flow.Flow

class PostRepository(private val postDao: PostDao) {

    fun observePosts(): Flow<List<Post>> = postDao.observeAll()

    suspend fun addPost(content: String) {
        val post = Post(content = content)
        postDao.insert(post)
    }

    suspend fun editPost(post: Post, newContent: String) {
        val updatedPost = post.copy(content = newContent)
        postDao.update(updatedPost)
    }

    suspend fun deletePost(post: Post) {
        postDao.delete(post)
    }
}