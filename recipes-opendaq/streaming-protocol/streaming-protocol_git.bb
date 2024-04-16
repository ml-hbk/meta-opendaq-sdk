SUMMARY             = "openDAQ streaming protocol"
AUTHOR              = "openDAQ d.o.o."
HOMEPAGE            = "https://opendaq.com/"
SECTION             = "openDAQ"
LICENSE             = "Apache-2.0"
PV                  = "0.10.12+git${SRCPV}"
DEPENDS             = "boost fmt libstream nlohmann-json spdlog"

inherit cmake

SRC_URI += "git://github.com/openDAQ/streaming-protocol-lt.git;protocol=https;branch=main"
SRCREV = "512f80d698ab3b1c162557875a34e22d7a9e699b"
S = "${WORKDIR}/git"

LIC_FILES_CHKSUM += "file://LICENSE;md5=86d3f3a95c324c9479bd8986968f4327"

EXTRA_OECMAKE += "\
    -DCMAKE_MODULE_PATH=${STAGING_DIR_TARGET}/usr/lib/cmake \
    -DFETCHCONTENT_FULLY_DISCONNECTED=ON \
"
