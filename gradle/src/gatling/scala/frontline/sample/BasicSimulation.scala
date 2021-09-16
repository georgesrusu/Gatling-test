/*
 * Copyright 2011-2018 GatlingCorp (https://gatling.io)
 *
 * All rights reserved.
 */

package frontline.sample

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import scala.concurrent.duration._

class BasicSimulation extends Simulation {

	val httpProtocol = http
		.baseUrl("http://virtualinnovationshowcase.com")
		.inferHtmlResources()
		.acceptHeader("*/*")
		.acceptLanguageHeader("en-US,en;q=0.5")
		.userAgentHeader("Mozilla/5.0 (Macintosh; Intel Mac OS X 10.15; rv:92.0) Gecko/20100101 Firefox/92.0")

	val headers_0 = Map(
		"Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,*/*;q=0.8",
		"Accept-Encoding" -> "gzip, deflate",
		"Upgrade-Insecure-Requests" -> "1")

	val headers_1 = Map(
		"Accept" -> "application/font-woff2;q=1.0,application/font-woff;q=0.9,*/*;q=0.8",
		"Accept-Encoding" -> "gzip, deflate")

	val headers_2 = Map(
		"Accept-Encoding" -> "gzip, deflate",
		"Content-Type" -> "application/x-www-form-urlencoded; charset=UTF-8",
		"Origin" -> "http://virtualinnovationshowcase.com",
		"X-Requested-With" -> "XMLHttpRequest")

	val headers_3 = Map(
		"Accept" -> "image/webp,*/*",
		"Accept-Encoding" -> "gzip, deflate")

	val headers_6 = Map(
		"Accept" -> "video/webm,video/ogg,video/*;q=0.9,application/ogg;q=0.7,audio/*;q=0.6,*/*;q=0.5",
		"Range" -> "bytes=0-")

	val headers_13 = Map(
		"Accept" -> "audio/webm,audio/ogg,audio/wav,audio/*;q=0.9,application/ogg;q=0.7,video/*;q=0.6,*/*;q=0.5",
		"Range" -> "bytes=0-")

	val headers_15 = Map("Accept-Encoding" -> "gzip, deflate")

	val headers_23 = Map(
		"Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,*/*;q=0.8",
		"Accept-Encoding" -> "gzip, deflate",
		"Cache-Control" -> "no-cache",
		"DNT" -> "1",
		"Pragma" -> "no-cache",
		"Upgrade-Insecure-Requests" -> "1")

	val headers_24 = Map(
		"Accept" -> "image/webp,*/*",
		"Accept-Encoding" -> "gzip, deflate",
		"Cache-Control" -> "no-cache",
		"DNT" -> "1",
		"Pragma" -> "no-cache")

	val headers_25 = Map(
		"Accept" -> "application/font-woff2;q=1.0,application/font-woff;q=0.9,*/*;q=0.8",
		"Accept-Encoding" -> "gzip, deflate",
		"Cache-Control" -> "no-cache",
		"DNT" -> "1",
		"Pragma" -> "no-cache")

	val headers_26 = Map(
		"Accept-Encoding" -> "gzip, deflate",
		"Cache-Control" -> "no-cache",
		"Content-Type" -> "application/x-www-form-urlencoded; charset=UTF-8",
		"DNT" -> "1",
		"Origin" -> "http://virtualinnovationshowcase.com",
		"Pragma" -> "no-cache",
		"X-Requested-With" -> "XMLHttpRequest")

	val headers_27 = Map(
		"Accept" -> "video/webm,video/ogg,video/*;q=0.9,application/ogg;q=0.7,audio/*;q=0.6,*/*;q=0.5",
		"Cache-Control" -> "no-cache",
		"DNT" -> "1",
		"Pragma" -> "no-cache",
		"Range" -> "bytes=0-")

	val headers_28 = Map(
		"Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,*/*;q=0.8",
		"Accept-Encoding" -> "gzip, deflate",
		"Cache-Control" -> "max-age=0",
		"Upgrade-Insecure-Requests" -> "1")

	val headers_29 = Map(
		"Accept" -> "image/webp,*/*",
		"Accept-Encoding" -> "gzip, deflate",
		"Cache-Control" -> "max-age=0",
		"If-Modified-Since" -> "Tue, 10 Aug 2021 14:26:24 GMT",
		"If-None-Match" -> """"178940-5c93549504400"""")

	val headers_30 = Map(
		"Accept" -> "video/webm,video/ogg,video/*;q=0.9,application/ogg;q=0.7,audio/*;q=0.6,*/*;q=0.5",
		"Cache-Control" -> "max-age=0",
		"If-Modified-Since" -> "Tue, 10 Aug 2021 14:56:56 GMT",
		"If-None-Match" -> """"cc2c09-5c935b6825e00"""",
		"Range" -> "bytes=0-")

	val headers_32 = Map(
		"Accept" -> "image/webp,*/*",
		"Accept-Encoding" -> "gzip, deflate",
		"Cache-Control" -> "max-age=0",
		"If-Modified-Since" -> "Tue, 10 Aug 2021 14:26:14 GMT",
		"If-None-Match" -> """"1510-5c93548b7ad80"""")

	val headers_33 = Map(
		"Accept" -> "video/webm,video/ogg,video/*;q=0.9,application/ogg;q=0.7,audio/*;q=0.6,*/*;q=0.5",
		"Range" -> "bytes=10485760-")

	val scn = scenario("RecordedSimulation")
		.exec(http("request_0")
			.get("/")
			.headers(headers_0)
			.resources(http("request_1")
			.get("/uploads/fonts/MarkWebPro-MediumW01Regular.ttf")
			.headers(headers_1),
            http("request_2")
			.post("/event/tracker/add")
			.headers(headers_2)
			.formParam("event", "/"),
            http("request_3")
			.get("/favicon.ico")
			.headers(headers_3),
            http("request_4")
			.get("/uploads/img/posterMCDS.png")
			.headers(headers_3)))
		.pause(2)
		.exec(http("request_5")
			.get("/uploads/img/pause.png")
			.headers(headers_3)
			.resources(http("request_6")
			.get("/uploads/video/DTS2021/Intro%20And%20Waiting%20Dts-1.mp4")
			.headers(headers_6)))
		.pause(44)
		.exec(http("request_7")
			.get("/uploads/video/DTS2021/Waiting%20Room1%20Dts-1.mp4")
			.headers(headers_6)
			.resources(http("request_8")
			.post("/event/tracker/add")
			.headers(headers_2)
			.formParam("event", "/")))
		.pause(1)
		.exec(http("request_9")
			.post("/event/tracker/add")
			.headers(headers_2)
			.formParam("event", "/")
			.resources(http("request_10")
			.get("/uploads/video/DTS2021/Intro%20Vcc%20Dts-1.mp4")
			.headers(headers_6)))
		.pause(14)
		.exec(http("request_11")
			.post("/event/tracker/add")
			.headers(headers_2)
			.formParam("event", "/")
			.resources(http("request_12")
			.get("/uploads/video/MCDS/04.Voice_Consumer_Controls/02Vcc%20Scenario1-1.mp4")
			.headers(headers_6)))
		.pause(1)
		.exec(http("request_13")
			.get("/uploads/video/2%20Demo_Voice_Consumers_Control/Sons/geneve_ext_parc_matin_tot_tourterelles_oiseaux_circuation_faible_au_loin_ms-sdo.png.mp3")
			.headers(headers_13)
			.resources(http("request_14")
			.get("/uploads/video/2%20Demo_Voice_Consumers_Control/Sons/geneve_ext_parc_matin_tot_tourterelles_oiseaux_circuation_faible_au_loin_ms-sdo.png.mp3")
			.headers(headers_13)))
		.pause(21)
		.exec(http("request_15")
			.get(uri1)
			.headers(headers_15))
		.pause(66)
		.exec(http("request_16")
			.post("/event/tracker/add")
			.headers(headers_2)
			.formParam("event", "/")
			.resources(http("request_17")
			.get("/uploads/video/MCDS/04.Voice_Consumer_Controls/03Vcc%20Scenario2-1.mp4")
			.headers(headers_6)))
		.pause(21)
		.exec(http("request_18")
			.post("/event/tracker/add")
			.headers(headers_2)
			.formParam("event", "/"))
		.pause(2)
		.exec(http("request_19")
			.post("/event/tracker/add")
			.headers(headers_2)
			.formParam("event", "/")
			.resources(http("request_20")
			.get("/uploads/video/DTS2021/Intro%20Mc%20Donate%20Dts-1.mp4")
			.headers(headers_6)))
		.pause(7)
		.exec(http("request_21")
			.post("/event/tracker/add")
			.headers(headers_2)
			.formParam("event", "/")
			.resources(http("request_22")
			.get("/uploads/video/MCDS/09.Mastercard_Donate_MCDS/02.MC_Donate.mp4")
			.headers(headers_6)))
		.pause(1)
		.exec(http("request_23")
			.get("/")
			.headers(headers_23)
			.resources(http("request_24")
			.get("/uploads/img/posterMCDS.png")
			.headers(headers_24),
            http("request_25")
			.get("/uploads/fonts/MarkWebPro-MediumW01Regular.ttf")
			.headers(headers_25)))
		.pause(1)
		.exec(http("request_26")
			.post("/event/tracker/add")
			.headers(headers_26)
			.formParam("event", "/")
			.resources(http("request_27")
			.get("/uploads/video/DTS2021/Intro%20And%20Waiting%20Dts-1.mp4")
			.headers(headers_27)))
		.pause(117)
		.exec(http("request_28")
			.get("/")
			.headers(headers_28)
			.resources(http("request_29")
			.get("/uploads/img/posterMCDS.png")
			.headers(headers_29),
            http("request_30")
			.get("/uploads/video/DTS2021/Intro%20And%20Waiting%20Dts-1.mp4")
			.headers(headers_30),
            http("request_31")
			.post("/event/tracker/add")
			.headers(headers_2)
			.formParam("event", "/")))
		.pause(1)
		.exec(http("request_32")
			.get("/uploads/img/pause.png")
			.headers(headers_32))
		.pause(3)
		.exec(http("request_33")
			.get("/uploads/video/DTS2021/Intro%20And%20Waiting%20Dts-1.mp4")
			.headers(headers_33))
		.pause(2)
		.exec(http("request_34")
			.post("/event/tracker/add")
			.headers(headers_2)
			.formParam("event", "/")
			.resources(http("request_35")
			.get("/uploads/video/DTS2021/Waiting%20Room2%20Dts-1.mp4")
			.headers(headers_6)))
		.pause(2)
		.exec(http("request_36")
			.post("/event/tracker/add")
			.headers(headers_2)
			.formParam("event", "/")
			.resources(http("request_37")
			.get("/uploads/video/DTS2021/Intro%20Mbp%20Dts-1.mp4")
			.headers(headers_6)))

	setUp(scn.inject(atOnceUsers(1))).protocols(httpProtocol)
}