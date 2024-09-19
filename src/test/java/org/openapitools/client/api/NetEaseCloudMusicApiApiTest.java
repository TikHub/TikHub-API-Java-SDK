/*
 * Douyin(抖音) TikTok Xiaohongshu(小红书) Kuaishou(快手) Weibo(微博) Instagram YouTube(油管) Twitter(X) Captcha Solver(验证码解决器) Temp Mail(临时邮箱) API(接口).
 * High-performance asynchronous Douyin(抖音) TikTok Xiaohongshu(小红书) Kuaishou(快手) Weibo(微博) Instagram YouTube(油管) Twitter(X) Captcha Solver(验证码解决器) Temp Mail(临时邮箱) API(接口).
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.api;

import org.openapitools.client.ApiException;
import org.openapitools.client.model.HttpValidationError;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for NetEaseCloudMusicApiApi
 */
@Ignore
public class NetEaseCloudMusicApiApiTest {

    private final NetEaseCloudMusicApiApi api = new NetEaseCloudMusicApiApi();

    
    /**
     * 解密POST请求中的16进制payload/Decrypt the 16-bit payload in the POST request
     *
     * # [中文] ### 用途: - 解密网易云音乐APP POST请求中的16进制payload。 ### 参数: - payload: 16进制payload。 ### 返回: - 解密后的payload  # [English] ### Purpose: - Decrypt the 16-bit payload in the POST request of NetEase Cloud Music APP. ### Parameters: - payload: 16-bit payload. ### Returns: - Decrypted payload  # [示例/Example] payload &#x3D; \&quot;4AEEAB033C3F4068DBB74379B8C889D2187585FBBBC7CA1ADA7D10714AA139AE279A615DE7B87483A83A9091ED52D70B70DA02A7FE8A20317AA40F0FF461AC33DB77371E30F9C7F57783E800559AE08DD1E10EFC9CDC69D6815ADCDBF5A7D3006AA3B102FBE7296AB0DB9EA5C46AD12B\&quot;
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void decryptPostPayloadApiV1NetEaseCloudMusicAppDecryptPostPayloadPostTest() throws ApiException {
        String body = null;
        String response = api.decryptPostPayloadApiV1NetEaseCloudMusicAppDecryptPostPayloadPost(body);

        // TODO: test validations
    }
    
    /**
     * 解密POST请求中的16进制payload/Decrypt the 16-bit payload in the POST request
     *
     * # [中文] ### 用途: - 解密网易云音乐APP POST请求中的16进制payload。 ### 参数: - payload: 16进制payload。 ### 返回: - 解密后的payload  # [English] ### Purpose: - Decrypt the 16-bit payload in the POST request of NetEase Cloud Music APP. ### Parameters: - payload: 16-bit payload. ### Returns: - Decrypted payload  # [示例/Example] payload &#x3D; \&quot;4AEEAB033C3F4068DBB74379B8C889D2187585FBBBC7CA1ADA7D10714AA139AE279A615DE7B87483A83A9091ED52D70B70DA02A7FE8A20317AA40F0FF461AC33DB77371E30F9C7F57783E800559AE08DD1E10EFC9CDC69D6815ADCDBF5A7D3006AA3B102FBE7296AB0DB9EA5C46AD12B\&quot;
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void decryptPostPayloadApiV1NetEaseCloudMusicAppDecryptPostPayloadPost_0Test() throws ApiException {
        String body = null;
        String response = api.decryptPostPayloadApiV1NetEaseCloudMusicAppDecryptPostPayloadPost_0(body);

        // TODO: test validations
    }
    
    /**
     * 加密POST请求中的payload并且返回16进制/Encrypt the payload in the POST request and return 16 hexadecimal
     *
     * # [中文] ### 用途: - 加密POST请求中的payload并且返回16进制。 ### 参数: - payload: 需要加密的payload。 ### 返回: - 加密后的16进制payload  # [English] ### Purpose: - Encrypt the payload in the POST request and return 16 hexadecimal. ### Parameters: - payload: Payload to be encrypted. ### Returns: - Encrypted 16 hexadecimal payload  # [示例/Example] payload &#x3D; {\&quot;id\&quot;: 2135155051, \&quot;br\&quot;: 192000}
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void encryptPostPayloadApiV1NetEaseCloudMusicAppEncryptPostPayloadPostTest() throws ApiException {
        String uri = null;
        Boolean addVariable = null;
        Object body = null;
        String response = api.encryptPostPayloadApiV1NetEaseCloudMusicAppEncryptPostPayloadPost(uri, addVariable, body);

        // TODO: test validations
    }
    
    /**
     * 加密POST请求中的payload并且返回16进制/Encrypt the payload in the POST request and return 16 hexadecimal
     *
     * # [中文] ### 用途: - 加密POST请求中的payload并且返回16进制。 ### 参数: - payload: 需要加密的payload。 ### 返回: - 加密后的16进制payload  # [English] ### Purpose: - Encrypt the payload in the POST request and return 16 hexadecimal. ### Parameters: - payload: Payload to be encrypted. ### Returns: - Encrypted 16 hexadecimal payload  # [示例/Example] payload &#x3D; {\&quot;id\&quot;: 2135155051, \&quot;br\&quot;: 192000}
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void encryptPostPayloadApiV1NetEaseCloudMusicAppEncryptPostPayloadPost_0Test() throws ApiException {
        String uri = null;
        Boolean addVariable = null;
        Object body = null;
        String response = api.encryptPostPayloadApiV1NetEaseCloudMusicAppEncryptPostPayloadPost_0(uri, addVariable, body);

        // TODO: test validations
    }
    
    /**
     * 获取歌手信息/Fetch artist detail
     *
     * # [中文] ### 用途: - 获取歌手信息。 ### 参数: - artist_id: 歌手ID。 ### 返回: - 歌手信息  # [English] ### Purpose: - Fetch artist detail. ### Parameters: - artist_id: Artist ID. ### Returns: - Artist detail  # [示例/Example] artist_id &#x3D; \&quot;12213291\&quot;
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void fetchArtistDetailApiV1NetEaseCloudMusicAppFetchArtistDetailGetTest() throws ApiException {
        String artistId = null;
        String response = api.fetchArtistDetailApiV1NetEaseCloudMusicAppFetchArtistDetailGet(artistId);

        // TODO: test validations
    }
    
    /**
     * 获取歌手信息/Fetch artist detail
     *
     * # [中文] ### 用途: - 获取歌手信息。 ### 参数: - artist_id: 歌手ID。 ### 返回: - 歌手信息  # [English] ### Purpose: - Fetch artist detail. ### Parameters: - artist_id: Artist ID. ### Returns: - Artist detail  # [示例/Example] artist_id &#x3D; \&quot;12213291\&quot;
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void fetchArtistDetailApiV1NetEaseCloudMusicAppFetchArtistDetailGet_0Test() throws ApiException {
        String artistId = null;
        String response = api.fetchArtistDetailApiV1NetEaseCloudMusicAppFetchArtistDetailGet_0(artistId);

        // TODO: test validations
    }
    
    /**
     * 获取歌曲评论/Fetch music comment
     *
     * # [中文] ### 用途: - 获取歌曲评论。 ### 参数: - resource_id: 资源ID，可以是歌曲ID，专辑ID等。 - beforeTime: 时间戳，用于翻页，第一页不需要传递，第二页传递第一页返回的最后一条评论的时间戳，或者查看返回的Next_Page_beforeTime字段。 - limit: 每页数量，默认为30。 ### 返回: - 歌曲评论  # [English] ### Purpose: - Fetch music comment. ### Parameters: - resource_id: Resource ID, can be song ID, album ID, etc. - beforeTime: Time stamp, used for paging, no need to pass on the first page, pass the time stamp of the last comment returned on the first page on the second page, or check the Next_Page_beforeTime field returned. - limit: Number per page, default is 30. ### Returns: - Music comment  # [示例/Example] resource_id &#x3D; \&quot;2135155051\&quot; beforeTime &#x3D; \&quot;0\&quot; limit &#x3D; \&quot;30\&quot;
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void fetchMusicCommentApiV1NetEaseCloudMusicAppFetchMusicCommentGetTest() throws ApiException {
        String resourceId = null;
        String beforeTime = null;
        String limit = null;
        String response = api.fetchMusicCommentApiV1NetEaseCloudMusicAppFetchMusicCommentGet(resourceId, beforeTime, limit);

        // TODO: test validations
    }
    
    /**
     * 获取歌曲评论/Fetch music comment
     *
     * # [中文] ### 用途: - 获取歌曲评论。 ### 参数: - resource_id: 资源ID，可以是歌曲ID，专辑ID等。 - beforeTime: 时间戳，用于翻页，第一页不需要传递，第二页传递第一页返回的最后一条评论的时间戳，或者查看返回的Next_Page_beforeTime字段。 - limit: 每页数量，默认为30。 ### 返回: - 歌曲评论  # [English] ### Purpose: - Fetch music comment. ### Parameters: - resource_id: Resource ID, can be song ID, album ID, etc. - beforeTime: Time stamp, used for paging, no need to pass on the first page, pass the time stamp of the last comment returned on the first page on the second page, or check the Next_Page_beforeTime field returned. - limit: Number per page, default is 30. ### Returns: - Music comment  # [示例/Example] resource_id &#x3D; \&quot;2135155051\&quot; beforeTime &#x3D; \&quot;0\&quot; limit &#x3D; \&quot;30\&quot;
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void fetchMusicCommentApiV1NetEaseCloudMusicAppFetchMusicCommentGet_0Test() throws ApiException {
        String resourceId = null;
        String beforeTime = null;
        String limit = null;
        String response = api.fetchMusicCommentApiV1NetEaseCloudMusicAppFetchMusicCommentGet_0(resourceId, beforeTime, limit);

        // TODO: test validations
    }
    
    /**
     * Mlog（音乐视频）播放地址/Mlog (music video) playback address
     *
     * # [中文] ### 用途: - 获取Mlog（音乐视频）播放地址。 ### 参数: - mlogId: Mlog ID，可以在APP中点击分享按钮获取链接，链接中包含mlogId。 - resolution: 分辨率，默认为1080，保持默认即可。 ### 返回: - Mlog播放地址（有时候会有水印，根据视频源而定。）  # [English] ### Purpose: - Fetch Mlog (music video) playback address. ### Parameters: - mlogId: Mlog ID, you can get the link by clicking the share button in the APP, the link contains mlogId. - resolution: Resolution, default is 1080, keep the default. ### Returns: - Mlog playback address (sometimes there will be a watermark, depending on the video source.)  # [示例/Example] &gt; 分享链接/Share link: https://fn.music.163.com/g/mlog/mlog-mobile/landing/mlog?id&#x3D;a1qQQOQNVueO2g7&amp;type&#x3D;2 mlogId &#x3D; \&quot;a1qQQOQNVueO2g7\&quot;
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void fetchMusicLogVideoUrlApiV1NetEaseCloudMusicAppFetchMusicLogVideoUrlGetTest() throws ApiException {
        String mlogId = null;
        String resolution = null;
        String response = api.fetchMusicLogVideoUrlApiV1NetEaseCloudMusicAppFetchMusicLogVideoUrlGet(mlogId, resolution);

        // TODO: test validations
    }
    
    /**
     * Mlog（音乐视频）播放地址/Mlog (music video) playback address
     *
     * # [中文] ### 用途: - 获取Mlog（音乐视频）播放地址。 ### 参数: - mlogId: Mlog ID，可以在APP中点击分享按钮获取链接，链接中包含mlogId。 - resolution: 分辨率，默认为1080，保持默认即可。 ### 返回: - Mlog播放地址（有时候会有水印，根据视频源而定。）  # [English] ### Purpose: - Fetch Mlog (music video) playback address. ### Parameters: - mlogId: Mlog ID, you can get the link by clicking the share button in the APP, the link contains mlogId. - resolution: Resolution, default is 1080, keep the default. ### Returns: - Mlog playback address (sometimes there will be a watermark, depending on the video source.)  # [示例/Example] &gt; 分享链接/Share link: https://fn.music.163.com/g/mlog/mlog-mobile/landing/mlog?id&#x3D;a1qQQOQNVueO2g7&amp;type&#x3D;2 mlogId &#x3D; \&quot;a1qQQOQNVueO2g7\&quot;
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void fetchMusicLogVideoUrlApiV1NetEaseCloudMusicAppFetchMusicLogVideoUrlGet_0Test() throws ApiException {
        String mlogId = null;
        String resolution = null;
        String response = api.fetchMusicLogVideoUrlApiV1NetEaseCloudMusicAppFetchMusicLogVideoUrlGet_0(mlogId, resolution);

        // TODO: test validations
    }
    
    /**
     * 获取单一歌曲歌词/Fetch one music lyric
     *
     * # [中文] ### 用途: - 获取单个音乐歌词。 ### 参数: - music_id: 音乐ID ### 返回: - 音乐歌词  # [English] ### Purpose: - Fetch single music lyric. ### Parameters: - music_id: Music ID ### Returns: - Music lyric  # [示例/Example] music_id &#x3D; \&quot;2135155051\&quot;
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void fetchOneMusicLyricApiV1NetEaseCloudMusicAppFetchOneMusicLyricGetTest() throws ApiException {
        String musicId = null;
        String response = api.fetchOneMusicLyricApiV1NetEaseCloudMusicAppFetchOneMusicLyricGet(musicId);

        // TODO: test validations
    }
    
    /**
     * 获取单一歌曲歌词/Fetch one music lyric
     *
     * # [中文] ### 用途: - 获取单个音乐歌词。 ### 参数: - music_id: 音乐ID ### 返回: - 音乐歌词  # [English] ### Purpose: - Fetch single music lyric. ### Parameters: - music_id: Music ID ### Returns: - Music lyric  # [示例/Example] music_id &#x3D; \&quot;2135155051\&quot;
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void fetchOneMusicLyricApiV1NetEaseCloudMusicAppFetchOneMusicLyricGet_0Test() throws ApiException {
        String musicId = null;
        String response = api.fetchOneMusicLyricApiV1NetEaseCloudMusicAppFetchOneMusicLyricGet_0(musicId);

        // TODO: test validations
    }
    
    /**
     * 获取单一歌曲播放地址V1（只能返回MP3格式，支持参数较少）/Fetch one music URL V1 (only MP3 format is supported, with fewer parameters)
     *
     * # [中文] ### 用途: - 获取单个音乐播放地址，此接口只能返回MP3格式的音频文件链接。 ### 参数: - music_id: 音乐ID - br: 音质码率，分四个等级，128000,192000,320000,999000 ### 返回: - 音乐播放地址  # [English] ### Purpose: - Fetch single music URL, this interface can only return MP3 format audio file link. ### Parameters: - music_id: Music ID - br: Bitrate, divided into four levels, 128000,192000,320000,999000 ### Returns: - Music URL  # [示例/Example] music_id &#x3D; \&quot;2135155051\&quot; br &#x3D; \&quot;192000\&quot;
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void fetchOneMusicUrlV1ApiV1NetEaseCloudMusicAppFetchOneMusicUrlV1GetTest() throws ApiException {
        String musicId = null;
        String br = null;
        String response = api.fetchOneMusicUrlV1ApiV1NetEaseCloudMusicAppFetchOneMusicUrlV1Get(musicId, br);

        // TODO: test validations
    }
    
    /**
     * 获取单一歌曲播放地址V1（只能返回MP3格式，支持参数较少）/Fetch one music URL V1 (only MP3 format is supported, with fewer parameters)
     *
     * # [中文] ### 用途: - 获取单个音乐播放地址，此接口只能返回MP3格式的音频文件链接。 ### 参数: - music_id: 音乐ID - br: 音质码率，分四个等级，128000,192000,320000,999000 ### 返回: - 音乐播放地址  # [English] ### Purpose: - Fetch single music URL, this interface can only return MP3 format audio file link. ### Parameters: - music_id: Music ID - br: Bitrate, divided into four levels, 128000,192000,320000,999000 ### Returns: - Music URL  # [示例/Example] music_id &#x3D; \&quot;2135155051\&quot; br &#x3D; \&quot;192000\&quot;
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void fetchOneMusicUrlV1ApiV1NetEaseCloudMusicAppFetchOneMusicUrlV1Get_0Test() throws ApiException {
        String musicId = null;
        String br = null;
        String response = api.fetchOneMusicUrlV1ApiV1NetEaseCloudMusicAppFetchOneMusicUrlV1Get_0(musicId, br);

        // TODO: test validations
    }
    
    /**
     * 获取单一歌曲播放地址V2（支持更多参数）/Fetch one music URL V2 (support more parameters)
     *
     * # [中文] ### 用途: - 获取单个音乐播放地址，此接口支持更多参数。 ### 参数: - music_id: 音乐ID - level: 音质等级，分五个等级，标准，较高，极高，无损，hires，后两个等级不一定有支持的音源。     - 标准：standard     - 较高：higher     - 极高：exhigh     - 无损：lossLess     - hires：hires - encodeType: 编码类型，分六种类型。     - aac：aac     - mp3：mp3（默认）     - flac：flac     - alac：alac     - ape：ape     - wav：wav ### 返回: - 音乐播放地址  # [English] ### Purpose: - Fetch single music URL, this interface supports more parameters. ### Parameters: - music_id: Music ID - level: Quality level, divided into five levels, standard, higher, exhigh, lossLess, hires, the last two levels may not have supported audio sources.     - standard     - higher     - exhigh     - lossLess     - hires - encodeType: Encoding type, divided into six types.     - aac     - mp3 (default)     - flac     - alac     - ape     - wav ### Returns: - Music URL  # [示例/Example] music_id &#x3D; \&quot;2135155051\&quot; level &#x3D; \&quot;exhigh\&quot; encodeType &#x3D; \&quot;mp3\&quot;
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void fetchOneMusicUrlV2ApiV1NetEaseCloudMusicAppFetchOneMusicUrlV2GetTest() throws ApiException {
        String musicId = null;
        String level = null;
        String encodeType = null;
        String response = api.fetchOneMusicUrlV2ApiV1NetEaseCloudMusicAppFetchOneMusicUrlV2Get(musicId, level, encodeType);

        // TODO: test validations
    }
    
    /**
     * 获取单一歌曲播放地址V2（支持更多参数）/Fetch one music URL V2 (support more parameters)
     *
     * # [中文] ### 用途: - 获取单个音乐播放地址，此接口支持更多参数。 ### 参数: - music_id: 音乐ID - level: 音质等级，分五个等级，标准，较高，极高，无损，hires，后两个等级不一定有支持的音源。     - 标准：standard     - 较高：higher     - 极高：exhigh     - 无损：lossLess     - hires：hires - encodeType: 编码类型，分六种类型。     - aac：aac     - mp3：mp3（默认）     - flac：flac     - alac：alac     - ape：ape     - wav：wav ### 返回: - 音乐播放地址  # [English] ### Purpose: - Fetch single music URL, this interface supports more parameters. ### Parameters: - music_id: Music ID - level: Quality level, divided into five levels, standard, higher, exhigh, lossLess, hires, the last two levels may not have supported audio sources.     - standard     - higher     - exhigh     - lossLess     - hires - encodeType: Encoding type, divided into six types.     - aac     - mp3 (default)     - flac     - alac     - ape     - wav ### Returns: - Music URL  # [示例/Example] music_id &#x3D; \&quot;2135155051\&quot; level &#x3D; \&quot;exhigh\&quot; encodeType &#x3D; \&quot;mp3\&quot;
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void fetchOneMusicUrlV2ApiV1NetEaseCloudMusicAppFetchOneMusicUrlV2Get_0Test() throws ApiException {
        String musicId = null;
        String level = null;
        String encodeType = null;
        String response = api.fetchOneMusicUrlV2ApiV1NetEaseCloudMusicAppFetchOneMusicUrlV2Get_0(musicId, level, encodeType);

        // TODO: test validations
    }
    
    /**
     * 获取单一歌曲信息V1（信息更全）| Fetch one music information V1 (more information)
     *
     * # [中文] ### 用途: - 获取单个音乐数据，此接口不会返回音频文件链接，仅返回音乐信息。 ### 参数: - music_id: 音乐ID ### 返回: - 音乐数据  # [English] ### Purpose: - Fetch single music data, this interface will not return audio file link, only return music information. ### Parameters: - music_id: Music ID ### Returns: - Music data  # [示例/Example] music_id &#x3D; \&quot;2135155051\&quot;
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void fetchOneMusicV1ApiV1NetEaseCloudMusicAppFetchOneMusicV1GetTest() throws ApiException {
        String musicId = null;
        String response = api.fetchOneMusicV1ApiV1NetEaseCloudMusicAppFetchOneMusicV1Get(musicId);

        // TODO: test validations
    }
    
    /**
     * 获取单一歌曲信息V1（信息更全）| Fetch one music information V1 (more information)
     *
     * # [中文] ### 用途: - 获取单个音乐数据，此接口不会返回音频文件链接，仅返回音乐信息。 ### 参数: - music_id: 音乐ID ### 返回: - 音乐数据  # [English] ### Purpose: - Fetch single music data, this interface will not return audio file link, only return music information. ### Parameters: - music_id: Music ID ### Returns: - Music data  # [示例/Example] music_id &#x3D; \&quot;2135155051\&quot;
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void fetchOneMusicV1ApiV1NetEaseCloudMusicAppFetchOneMusicV1Get_0Test() throws ApiException {
        String musicId = null;
        String response = api.fetchOneMusicV1ApiV1NetEaseCloudMusicAppFetchOneMusicV1Get_0(musicId);

        // TODO: test validations
    }
    
    /**
     * 获取单一歌曲信息V2（信息更少）| Fetch one music information V2 (less information)
     *
     * # [中文] ### 用途: - 获取单个音乐数据，此接口不会返回音频文件链接，仅返回音乐信息。 ### 参数: - music_id: 音乐ID ### 返回: - 音乐数据  # [English] ### Purpose: - Fetch single music data, this interface will not return audio file link, only return music information. ### Parameters: - music_id: Music ID ### Returns: - Music data  # [示例/Example] music_id &#x3D; \&quot;2135155051\&quot;
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void fetchOneMusicV2ApiV1NetEaseCloudMusicAppFetchOneMusicV2GetTest() throws ApiException {
        String musicId = null;
        String response = api.fetchOneMusicV2ApiV1NetEaseCloudMusicAppFetchOneMusicV2Get(musicId);

        // TODO: test validations
    }
    
    /**
     * 获取单一歌曲信息V2（信息更少）| Fetch one music information V2 (less information)
     *
     * # [中文] ### 用途: - 获取单个音乐数据，此接口不会返回音频文件链接，仅返回音乐信息。 ### 参数: - music_id: 音乐ID ### 返回: - 音乐数据  # [English] ### Purpose: - Fetch single music data, this interface will not return audio file link, only return music information. ### Parameters: - music_id: Music ID ### Returns: - Music data  # [示例/Example] music_id &#x3D; \&quot;2135155051\&quot;
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void fetchOneMusicV2ApiV1NetEaseCloudMusicAppFetchOneMusicV2Get_0Test() throws ApiException {
        String musicId = null;
        String response = api.fetchOneMusicV2ApiV1NetEaseCloudMusicAppFetchOneMusicV2Get_0(musicId);

        // TODO: test validations
    }
    
    /**
     * 获取用户动态/Fetch user event
     *
     * # [中文] ### 用途: - 获取用户动态。 ### 参数: - uid: 用户ID。 - _time: 时间戳，用于翻页，第一页不需要传递，第二页传递第一页返回的最后一条动态的时间戳，或者查看返回的Next_Page_time字段。 - limit: 每页数量，默认为10。 ### 返回: - 用户动态  # [English] ### Purpose: - Fetch user event. ### Parameters: - uid: User ID. - _time: Time stamp, used for paging, no need to pass on the first page, pass the time stamp of the last event returned on the first page on the second page, or check the Next_Page_time field returned. - limit: Number per page, default is 10. ### Returns: - User event  # [示例/Example] uid &#x3D; \&quot;254132915\&quot; _time &#x3D; \&quot;-1\&quot; limit &#x3D; \&quot;10\&quot;
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void fetchUserEventApiV1NetEaseCloudMusicAppFetchUserEventGetTest() throws ApiException {
        String uid = null;
        String time = null;
        String limit = null;
        String response = api.fetchUserEventApiV1NetEaseCloudMusicAppFetchUserEventGet(uid, time, limit);

        // TODO: test validations
    }
    
    /**
     * 获取用户动态/Fetch user event
     *
     * # [中文] ### 用途: - 获取用户动态。 ### 参数: - uid: 用户ID。 - _time: 时间戳，用于翻页，第一页不需要传递，第二页传递第一页返回的最后一条动态的时间戳，或者查看返回的Next_Page_time字段。 - limit: 每页数量，默认为10。 ### 返回: - 用户动态  # [English] ### Purpose: - Fetch user event. ### Parameters: - uid: User ID. - _time: Time stamp, used for paging, no need to pass on the first page, pass the time stamp of the last event returned on the first page on the second page, or check the Next_Page_time field returned. - limit: Number per page, default is 10. ### Returns: - User event  # [示例/Example] uid &#x3D; \&quot;254132915\&quot; _time &#x3D; \&quot;-1\&quot; limit &#x3D; \&quot;10\&quot;
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void fetchUserEventApiV1NetEaseCloudMusicAppFetchUserEventGet_0Test() throws ApiException {
        String uid = null;
        String time = null;
        String limit = null;
        String response = api.fetchUserEventApiV1NetEaseCloudMusicAppFetchUserEventGet_0(uid, time, limit);

        // TODO: test validations
    }
    
    /**
     * 获取用户粉丝列表/Fetch user followers
     *
     * # [中文] ### 用途: - 获取用户粉丝列表。 ### 参数: - uid: 用户ID。 - lasttime: 时间戳，用于翻页，第一页不需要传递，第二页传递第一页返回的最后一条动态的时间戳，或者查看返回的Next_Page_lasttime字段。 - pagesize: 每页数量，保持默认即可。 ### 返回: - 用户粉丝列表  # [English] ### Purpose: - Fetch user followers. ### Parameters: - uid: User ID. - lasttime: Time stamp, used for paging, no need to pass on the first page, pass the time stamp of the last event returned on the first page on the second page, or check the Next_Page_lasttime field returned. - pagesize: Number per page, keep the default. ### Returns: - User followers list  # [示例/Example] uid &#x3D; \&quot;254132915\&quot; lasttime &#x3D; \&quot;0\&quot; pagesize &#x3D; \&quot;20\&quot;
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void fetchUserFollowersApiV1NetEaseCloudMusicAppFetchUserFollowersGetTest() throws ApiException {
        String uid = null;
        String lasttime = null;
        String pagesize = null;
        String response = api.fetchUserFollowersApiV1NetEaseCloudMusicAppFetchUserFollowersGet(uid, lasttime, pagesize);

        // TODO: test validations
    }
    
    /**
     * 获取用户粉丝列表/Fetch user followers
     *
     * # [中文] ### 用途: - 获取用户粉丝列表。 ### 参数: - uid: 用户ID。 - lasttime: 时间戳，用于翻页，第一页不需要传递，第二页传递第一页返回的最后一条动态的时间戳，或者查看返回的Next_Page_lasttime字段。 - pagesize: 每页数量，保持默认即可。 ### 返回: - 用户粉丝列表  # [English] ### Purpose: - Fetch user followers. ### Parameters: - uid: User ID. - lasttime: Time stamp, used for paging, no need to pass on the first page, pass the time stamp of the last event returned on the first page on the second page, or check the Next_Page_lasttime field returned. - pagesize: Number per page, keep the default. ### Returns: - User followers list  # [示例/Example] uid &#x3D; \&quot;254132915\&quot; lasttime &#x3D; \&quot;0\&quot; pagesize &#x3D; \&quot;20\&quot;
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void fetchUserFollowersApiV1NetEaseCloudMusicAppFetchUserFollowersGet_0Test() throws ApiException {
        String uid = null;
        String lasttime = null;
        String pagesize = null;
        String response = api.fetchUserFollowersApiV1NetEaseCloudMusicAppFetchUserFollowersGet_0(uid, lasttime, pagesize);

        // TODO: test validations
    }
    
    /**
     * 获取用户关注列表/Fetch user follows
     *
     * # [中文] ### 用途: - 获取用户关注列表。 ### 参数: - uid: 用户ID。 - offset: 偏移量，第一次搜索传递0，第二次传递20，第三次传递40，以此类推。 - limit: 每页数量，保持默认即可。 ### 返回: - 用户关注列表  # [English] ### Purpose: - Fetch user follows. ### Parameters: - uid: User ID. - offset: Offset, pass 0 for the first search, 20 for the second search, 40 for the third search, and so on. - limit: Number per page, keep the default. ### Returns: - User follows list  # [示例/Example] uid &#x3D; \&quot;254132915\&quot; offset &#x3D; \&quot;0\&quot; limit &#x3D; \&quot;20\&quot;
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void fetchUserFollowsApiV1NetEaseCloudMusicAppFetchUserFollowsGetTest() throws ApiException {
        String uid = null;
        String offset = null;
        String limit = null;
        String response = api.fetchUserFollowsApiV1NetEaseCloudMusicAppFetchUserFollowsGet(uid, offset, limit);

        // TODO: test validations
    }
    
    /**
     * 获取用户关注列表/Fetch user follows
     *
     * # [中文] ### 用途: - 获取用户关注列表。 ### 参数: - uid: 用户ID。 - offset: 偏移量，第一次搜索传递0，第二次传递20，第三次传递40，以此类推。 - limit: 每页数量，保持默认即可。 ### 返回: - 用户关注列表  # [English] ### Purpose: - Fetch user follows. ### Parameters: - uid: User ID. - offset: Offset, pass 0 for the first search, 20 for the second search, 40 for the third search, and so on. - limit: Number per page, keep the default. ### Returns: - User follows list  # [示例/Example] uid &#x3D; \&quot;254132915\&quot; offset &#x3D; \&quot;0\&quot; limit &#x3D; \&quot;20\&quot;
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void fetchUserFollowsApiV1NetEaseCloudMusicAppFetchUserFollowsGet_0Test() throws ApiException {
        String uid = null;
        String offset = null;
        String limit = null;
        String response = api.fetchUserFollowsApiV1NetEaseCloudMusicAppFetchUserFollowsGet_0(uid, offset, limit);

        // TODO: test validations
    }
    
    /**
     * 获取用户信息/Get user information
     *
     * # [中文] ### 用途: - 获取用户信息。 ### 参数: - uid: 用户ID。 ### 返回: - 用户信息  # [English] ### Purpose: - Get user information. ### Parameters: - uid: User ID. ### Returns: - User information  # [示例/Example] uid &#x3D; \&quot;254132915\&quot;
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void fetchUserInfoApiV1NetEaseCloudMusicAppFetchUserInfoGetTest() throws ApiException {
        String uid = null;
        String response = api.fetchUserInfoApiV1NetEaseCloudMusicAppFetchUserInfoGet(uid);

        // TODO: test validations
    }
    
    /**
     * 获取用户信息/Get user information
     *
     * # [中文] ### 用途: - 获取用户信息。 ### 参数: - uid: 用户ID。 ### 返回: - 用户信息  # [English] ### Purpose: - Get user information. ### Parameters: - uid: User ID. ### Returns: - User information  # [示例/Example] uid &#x3D; \&quot;254132915\&quot;
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void fetchUserInfoApiV1NetEaseCloudMusicAppFetchUserInfoGet_0Test() throws ApiException {
        String uid = null;
        String response = api.fetchUserInfoApiV1NetEaseCloudMusicAppFetchUserInfoGet_0(uid);

        // TODO: test validations
    }
    
    /**
     * 获取用户歌单/Get user playlist
     *
     * # [中文] ### 用途: - 获取用户歌单。 ### 参数: - uid: 用户ID。 - offset: 偏移量，第一次搜索传递0，第二次传递20，第三次传递40，以此类推。 - limit: 每页数量，保持默认即可。 ### 返回: - 用户歌单  # [English] ### Purpose: - Get user playlist. ### Parameters: - uid: User ID. - offset: Offset, pass 0 for the first search, 20 for the second search, 40 for the third search, and so on. - limit: Number per page, keep the default. ### Returns: - User playlist  # [示例/Example] uid &#x3D; \&quot;254132915\&quot; offset &#x3D; \&quot;0\&quot; limit &#x3D; \&quot;20\&quot;
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void fetchUserPlaylistApiV1NetEaseCloudMusicAppFetchUserPlaylistGetTest() throws ApiException {
        String uid = null;
        String offset = null;
        String limit = null;
        String response = api.fetchUserPlaylistApiV1NetEaseCloudMusicAppFetchUserPlaylistGet(uid, offset, limit);

        // TODO: test validations
    }
    
    /**
     * 获取用户歌单/Get user playlist
     *
     * # [中文] ### 用途: - 获取用户歌单。 ### 参数: - uid: 用户ID。 - offset: 偏移量，第一次搜索传递0，第二次传递20，第三次传递40，以此类推。 - limit: 每页数量，保持默认即可。 ### 返回: - 用户歌单  # [English] ### Purpose: - Get user playlist. ### Parameters: - uid: User ID. - offset: Offset, pass 0 for the first search, 20 for the second search, 40 for the third search, and so on. - limit: Number per page, keep the default. ### Returns: - User playlist  # [示例/Example] uid &#x3D; \&quot;254132915\&quot; offset &#x3D; \&quot;0\&quot; limit &#x3D; \&quot;20\&quot;
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void fetchUserPlaylistApiV1NetEaseCloudMusicAppFetchUserPlaylistGet_0Test() throws ApiException {
        String uid = null;
        String offset = null;
        String limit = null;
        String response = api.fetchUserPlaylistApiV1NetEaseCloudMusicAppFetchUserPlaylistGet_0(uid, offset, limit);

        // TODO: test validations
    }
    
    /**
     * 搜索接口V1/Search interface V1
     *
     * # [中文] ### 用途: - 搜索接口V1。 ### 参数: - keywords: 关键词。 - offset: 偏移量，第一次搜索传递0，第二次传递20，第三次传递40，以此类推。 - limit: 每页数量，保持默认即可。 - _type: 搜索类型     **搜索类型 (&#x60;type&#x60;)**：     * 单曲搜索：&#x60;\&quot;type\&quot;:\&quot;1\&quot;&#x60;     * 歌手搜索：&#x60;\&quot;type\&quot;:\&quot;100\&quot;&#x60;     * 专辑搜索：&#x60;\&quot;type\&quot;:\&quot;10\&quot;&#x60;     * 歌单搜索：&#x60;\&quot;type\&quot;:\&quot;1000\&quot;&#x60;     * MV搜索：&#x60;\&quot;type\&quot;:\&quot;1004\&quot;&#x60;     * 主播电台搜索：&#x60;\&quot;type\&quot;:\&quot;1009\&quot;&#x60;     * 用户搜索：&#x60;\&quot;type\&quot;:\&quot;1002\&quot;&#x60; ### 返回: - 搜索结果  # [English] ### Purpose: - Search interface V1. ### Parameters: - keywords: Keywords. - offset: Offset, pass 0 for the first search, 20 for the second search, 40 for the third search, and so on. - limit: Number per page, keep the default. - _type: Search type     **Search type (&#x60;type&#x60;)**:     * Single search: &#x60;\&quot;type\&quot;:\&quot;1\&quot;&#x60;     * Singer search: &#x60;\&quot;type\&quot;:\&quot;100\&quot;&#x60;     * Album search: &#x60;\&quot;type\&quot;:\&quot;10\&quot;&#x60;     * Playlist search: &#x60;\&quot;type\&quot;:\&quot;1000\&quot;&#x60;     * MV search: &#x60;\&quot;type\&quot;:\&quot;1004\&quot;&#x60;     * Anchor radio search: &#x60;\&quot;type\&quot;:\&quot;1009\&quot;&#x60;     * User search: &#x60;\&quot;type\&quot;:\&quot;1002\&quot;&#x60; ### Returns: - Search results  # [示例/Example] keywords &#x3D; \&quot;周杰伦\&quot; offset &#x3D; \&quot;0\&quot; limit &#x3D; \&quot;20\&quot; _type &#x3D; \&quot;1\&quot;
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void searchV1ApiV1NetEaseCloudMusicAppSearchV1GetTest() throws ApiException {
        String keywords = null;
        String offset = null;
        String limit = null;
        String type = null;
        String response = api.searchV1ApiV1NetEaseCloudMusicAppSearchV1Get(keywords, offset, limit, type);

        // TODO: test validations
    }
    
    /**
     * 搜索接口V1/Search interface V1
     *
     * # [中文] ### 用途: - 搜索接口V1。 ### 参数: - keywords: 关键词。 - offset: 偏移量，第一次搜索传递0，第二次传递20，第三次传递40，以此类推。 - limit: 每页数量，保持默认即可。 - _type: 搜索类型     **搜索类型 (&#x60;type&#x60;)**：     * 单曲搜索：&#x60;\&quot;type\&quot;:\&quot;1\&quot;&#x60;     * 歌手搜索：&#x60;\&quot;type\&quot;:\&quot;100\&quot;&#x60;     * 专辑搜索：&#x60;\&quot;type\&quot;:\&quot;10\&quot;&#x60;     * 歌单搜索：&#x60;\&quot;type\&quot;:\&quot;1000\&quot;&#x60;     * MV搜索：&#x60;\&quot;type\&quot;:\&quot;1004\&quot;&#x60;     * 主播电台搜索：&#x60;\&quot;type\&quot;:\&quot;1009\&quot;&#x60;     * 用户搜索：&#x60;\&quot;type\&quot;:\&quot;1002\&quot;&#x60; ### 返回: - 搜索结果  # [English] ### Purpose: - Search interface V1. ### Parameters: - keywords: Keywords. - offset: Offset, pass 0 for the first search, 20 for the second search, 40 for the third search, and so on. - limit: Number per page, keep the default. - _type: Search type     **Search type (&#x60;type&#x60;)**:     * Single search: &#x60;\&quot;type\&quot;:\&quot;1\&quot;&#x60;     * Singer search: &#x60;\&quot;type\&quot;:\&quot;100\&quot;&#x60;     * Album search: &#x60;\&quot;type\&quot;:\&quot;10\&quot;&#x60;     * Playlist search: &#x60;\&quot;type\&quot;:\&quot;1000\&quot;&#x60;     * MV search: &#x60;\&quot;type\&quot;:\&quot;1004\&quot;&#x60;     * Anchor radio search: &#x60;\&quot;type\&quot;:\&quot;1009\&quot;&#x60;     * User search: &#x60;\&quot;type\&quot;:\&quot;1002\&quot;&#x60; ### Returns: - Search results  # [示例/Example] keywords &#x3D; \&quot;周杰伦\&quot; offset &#x3D; \&quot;0\&quot; limit &#x3D; \&quot;20\&quot; _type &#x3D; \&quot;1\&quot;
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void searchV1ApiV1NetEaseCloudMusicAppSearchV1Get_0Test() throws ApiException {
        String keywords = null;
        String offset = null;
        String limit = null;
        String type = null;
        String response = api.searchV1ApiV1NetEaseCloudMusicAppSearchV1Get_0(keywords, offset, limit, type);

        // TODO: test validations
    }
    
}