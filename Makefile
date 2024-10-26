# include ./Makefile.dev

build_common:
	mvn -f common install -DskipTests=true -o

build_core:
	mvn -f core install -DskipTests=true -o

test_core: 
	. ./.env && mvn -f core test -o

build_api:
	. ./.env && mvn -f webservice install -DskipTests=true -o

test_api: 
	. ./.env && mvn -f webservice test -o
	
build_native: 
	. ./.env && mvn clean && mvn -pl webservice native:compile -Pnative -DskipTests -o

native_image: 
	. ./.env && mvn -Pnative -pl webservice/ -am spring-boot:build-image

build_app: 
	mvn install -DskipTests=true -o

clean_build: clean_all build_app

clean_all:
	mvn clean -o

clean_module:
	mvn -f ${module} clean -o
	
build_api_image: build_api
	. ./.env && docker compose build api
		
run_api_local:
	. ./.env && mvn -pl webservice/ -am spring-boot:run

local_web_deps: build_web
	cd angular/target/imis && npm i

run_web_local: build_web
	cd angular/target/imis && npm start

build_web: 
	mvn -f angular install -DskipTests=true -o

build_web_dist: build_web local_web_deps
	. ./.env && cd angular/target/imis && npm run build --configuration=production