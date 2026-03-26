# osmosis-kakasi

## Installation

### Docker

The recommended approach for using this in docker is to create a `plugins` directory at the current
working directory. You may instead use the `~/.openstreetmaps/osmosis/plugins` directory but this
integration is more complex as the home directory may change depending on the `USER` configuration.

```dockerfile
FROM eclipse-temurin:21-jdk

RUN apt-get update -y
RUN apt-get install -y osmosis

RUN mkdir -p /plugins
RUN wget -O /plugins/osmosis-kakasi-1.1.0-plugin.zip https://github.com/villseriol/osmosis-kakasi/releases/download/1.1.0/osmosis-kakasi-1.1.0-plugin.zip

# dry-run of osmosis to confirm JPF loading works
RUN osmosis --read-empty --write-null
```

### Ubuntu

The recommended way of installing this plugin locally is to download the plugin `.zip` and copy it
to your user osmosis home directory.

```sh
sudo apt get install osmosis
mkdir -p ~/.openstreetmaps/osmosis/plugins
wget -O ~/.openstreetmaps/osmosis/plugins/osmosis-kakasi-1.1.0-plugin.zip https://github.com/villseriol/osmosis-kakasi/releases/download/1.1.0/osmosis-kakasi-1.1.0-plugin.zip

# dry-run of osmosis to confirm JPF loading works
osmosis --read-empty --write-null
```

### Windows

TBD

## Usage

## Disclaimer

This program is free software: you can redistribute it and/or modify it under the terms of the GNU
General Public License as published by the Free Software Foundation, either version 3 of the
License, or (at your option) any later version.

This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without
even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
General Public License for more details.

You should have received a copy of the GNU General Public License along with this program. If not,
see <https://www.gnu.org/licenses/>.
