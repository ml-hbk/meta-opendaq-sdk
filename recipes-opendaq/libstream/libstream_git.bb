SUMMARY             = "openDAQ streaming library"
AUTHOR              = "openDAQ d.o.o."
HOMEPAGE            = "https://opendaq.com/"
SECTION             = "libs"
LICENSE             = "Apache-2.0"
PV                  = "1.0.2+git${SRCPV}"
DEPENDS             = "boost"

inherit cmake

SRC_URI += "git://github.com/openDAQ/libstream.git;protocol=https;branch=main"

LIC_FILES_CHKSUM += "file://LICENSE;md5=86d3f3a95c324c9479bd8986968f4327"

SRCREV = "651e5e0571f7c64f498a4c4e8e4e3c11d555a064"
S = "${WORKDIR}/git"

EXTRA_OECMAKE += "\
    -DFETCHCONTENT_FULLY_DISCONNECTED=ON \
"
