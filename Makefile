test :
	lein test

download :
	wget http://api.steampowered.com/ISteamWebAPIUtil/GetSupportedAPIList/v0001/?key=$(STEAM_API_KEY) -O resources/apilist.json

regen :
	lein run
	lein cljfmt fix
