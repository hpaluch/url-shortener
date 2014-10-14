# url-shortener

URL shortener from http://adambard.com/blog/a-clojure-url-shortener-service/
Note: slightly modified

## Usage

Ensure that you have redis installed and running, for example on CentOS 7:

	yum install redis
	systemctl enable redis.service
	systemctl start redis.service

To run tests:

	lein test

To run url shortener (note - for non local use you may need  to replace http://localhost in src/url_shortener/core.clj with your url/port):

	lein run

On different terminal try:

	# create short url for http://www.linux.cz and store it to url.txt
	curl -v -d '' -o url.txt http://localhost:8080/http://www.linux.cz

	# show stored url (use echo to add newline):
	echo "`cat url.txt`"
	http://localhost:8080/623f96dd

	# download content
	curl -L -v -o out.txt `cat url.txt`

	# result from http://www.linux.cz is stored in out.txt

You may also check your redis using telnet:

	telnet 127.0.0.1 6379
	keys *
	...
	get /asdf
	# $17
	# http://google.com
	quit

See original code/text at: http://adambard.com/blog/a-clojure-url-shortener-service/

