#
# Regular cron jobs for the osmosis-kakasi package
#
0 4	* * *	root	[ -x /usr/bin/osmosis-kakasi_maintenance ] && /usr/bin/osmosis-kakasi_maintenance
