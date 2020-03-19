package com.lt.basics.net

/**
 * Created by HankGreen on 2017/11/16.
 * 封装返回的数据
 */
class BaseResponse<T>(val code :Int,
                      val msg:String,
                      val data:T)

/*
Request: ┌────── Request ────────────────────────────────────────────────────────────────────────
    │ URL: https://www.oschina.net/action/apiv2/banner?catalog=1
    │
I/Request: │ Method: @GET
    │
    │ Headers:
I/Request: │ ┌ log-header: I am the log request header.
    │ └
    │
    │
    │ Omitted request body
    └───────────────────────────────────────────────────────────────────────────────────────



Response: ┌────── Response ───────────────────────────────────────────────────────────────────────
    │ /action/apiv2/banner - is success : true - Received in: 614ms
    │
    │ Status Code: 200
    │
    │ Headers:
    │ ┌ Date: Thu, 19 Mar 2020 02:08:45 GMT
    │ ├ Content-Type: application/json;charset=utf-8
    │ ├ Content-Length: 1238
    │ ├ Connection: keep-alive
    │ ├ Server: Tengine
    │ ├ Set-Cookie: _user_behavior_=13994409-7d6b-425f-acba-ab8daede79d1; Domain=.oschina.net; Expires=Fri, 19-Mar-2
    │ 021 02:08:45 GMT; Path=/; HttpOnly
I/Response: │ └
    │
    │
    │ Body:
    │ {
    │    "code": 1,
    │    "message": "success",
    │    "notice": {
    │       "softwareCount": 0,
    │       "newsCount": 18
    │    },
    │    "result": {
    │       "items": [
    │          {
    │             "detail": "",
    │             "href": "https:\/\/m.bilibili.com\/video\/av95828615",
    │             "id": 0,
    │             "img": "https:\/\/static.oschina.net\/uploads\/cooperation\/78455\/intellij-idea-2016-3-public-pre
    │ view_4be39b82-2d04-4c20-a197-f78ea31d5d4d.png",
    │             "name": "摸鱼神器 | 程序猿+魔方=？？？",
    │             "pubDate": "2020-03-18 11:13:35",
    │             "type": 0,
I/Response: │             "weight": 9
    │          },
    │          {
    │             "detail": "",
    │             "href": "",
    │             "id": 114096,
    │             "img": "https:\/\/static.oschina.net\/uploads\/img\/201910\/31105553_xgZY.jpg",
    │             "name": "WSL2 即将普遍可用，Linux 内核提供方式改变",
    │             "pubDate": "2020-03-16 10:47:53",
    │             "type": 6,
    │             "weight": 8
    │          },
    │          {
    │             "detail": "",
    │             "href": "",
    │             "id": 114081,
    │             "img": "https:\/\/static.oschina.net\/uploads\/img\/201912\/25114105_CFQB.jpg",
    │             "name": "Linux 负载均衡算法存在瑕疵，修复后性能将提升一倍",
    │             "pubDate": "2020-03-16 10:48:54",
    │             "type": 6,
    │             "weight": 7
    │          },
    │          {
    │             "detail": "",
    │             "href": "",
    │             "id": 114020,
I/Response: │             "img": "https:\/\/static.oschina.net\/uploads\/img\/202003\/05110019_Gw4V.jpeg",
    │             "name": "loadlibrary：将 Windows DLL 加载到 Linux",
    │             "pubDate": "2020-03-16 10:50:08",
    │             "type": 6,
    │             "weight": 6
    │          }
    │       ],
    │       "nextPageToken": "A4398F94EDF60667",
    │       "prevPageToken": "B7DC67FBB70C320E",
    │       "requestCount": 4,
    │       "responseCount": 4,
    │       "totalResults": 4
    │    },
    │    "time": "2020-03-19 10:08:45"
    │ }
    └───────────────────────────────────────────────────────────────────────────────────────*/